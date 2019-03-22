CREATE TABLE person (
	dni                           integer PRIMARY KEY,
	name                          text NOT NULL,
	surname                       text NOT NULL,
	birthdate                     date NOT NULL,
	phone                         text,
	email                         text
);


CREATE OR REPLACE FUNCTION person (
	IN p_dni                      integer,
	IN p_name                     text,
	IN p_surname                  text,
	IN p_birthdate                date,
	IN p_phone                    text,
	IN p_email                    text
) RETURNS person AS $$
DECLARE
	v_queryString                 text;
	v_person                      person;
	
BEGIN
	IF p_dni IS NULL OR p_name IS NULL OR p_surname IS NULL OR p_birthdate IS NULL
	THEN
		RAISE EXCEPTION 'Parametro obligatorio recibio un valor nulo...';
	END IF;
	
	IF p_dni < 1000000
	THEN
		RAISE EXCEPTION 'EL dni es invalido...';
	END IF;

	IF p_birthdate > current_date
	THEN
		RAISE EXCEPTION 'La fecha de nacimiento es en el futuro...';
	END IF;

	v_queryString := format('
		INSERT INTO person(dni, name, surname, birthdate, phone, email) 
			VALUES(%s, %L, %L, %L, %L, %L)
		RETURNING *', p_dni, upper(p_name), upper(p_surname), p_birthdate, p_phone, lower(p_email)
	);

	RAISE NOTICE '%', v_queryString;
	
	EXECUTE v_queryString INTO v_person;

	RETURN v_person;
END;
$$ LANGUAGE plpgsql VOLATILE;


CREATE OR REPLACE FUNCTION person_destroy (
	IN p_dni                      integer
) RETURNS void AS $$
BEGIN
	IF NOT EXISTS(SELECT 1 FROM person WHERE dni = p_dni)
	THEN
		RAISE EXCEPTION 'El DNI no se corresponde con ninguna persona!';
	END IF;

	DELETE FROM person WHERE dni = p_dni;
END;
$$ LANGUAGE plpgsql VOLATILE STRICT;


CREATE OR REPLACE FUNCTION person_identify_by_dni (
	IN p_dni                      integer
) RETURNS person AS
$$
	SELECT p FROM person p WHERE dni = p_dni;
$$ LANGUAGE sql STABLE STRICT;


CREATE OR REPLACE FUNCTION person_search_by_surname (
	IN p_surname                  text DEFAULT '%'
) RETURNS person[] AS
$$
	SELECT ARRAY (
		SELECT p FROM person p 
			WHERE surname ILIKE '%' || p_surname || '%'
		ORDER BY surname
	);
$$ LANGUAGE sql STABLE;


CREATE OR REPLACE FUNCTION person_get_name (
	IN p_dni                      integer
) RETURNS text AS
$$
	SELECT name FROM person WHERE dni = p_dni;
$$ LANGUAGE sql STABLE STRICT;


CREATE OR REPLACE FUNCTION person_set_name (
	IN p_dni                      integer,
	IN p_name                     text
) RETURNS void AS $$
DECLARE
	v_name                        text;
	
BEGIN
	IF NOT EXISTS(SELECT 1 FROM person WHERE dni = p_dni)
	THEN
		RAISE EXCEPTION 'El DNI no se corresponde con ninguna persona!';
	END IF;

	v_name := upper(p_name);

	UPDATE person SET name = v_name WHERE dni = p_dni;
END;
$$ LANGUAGE plpgsql VOLATILE STRICT;