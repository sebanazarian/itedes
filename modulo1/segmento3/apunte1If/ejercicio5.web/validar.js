function validar(){

	genero = document.getElementById("genero").value;
	edad = document.getElementById("edad").value;

	if(genero.toUpperCase()=="M"&& edad>=18 ){
		alert(`El usuario es masculino y mayor de 18 años `);
	}

}
