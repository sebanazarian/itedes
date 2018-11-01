function validar(){
	
	let respuesta='';
	let carac = document.getElementById('carac').value;
	
	switch (carac.toUpperCase()){
		case 'I':
			respuesta='1';
			break;
		case 'V':
			respuesta='5';
			break;
		case 'X':
			respuesta='10';
			break;
		case 'L':
			respuesta='50';
			break;
		case 'C':
			respuesta='100';
			break;
		case 'D':
			respuesta='500';
			break;
		case 'M':
			respuesta='1000';
			break;
		default:
			respuesta='Error: Numero romano invalido';
			break;
	}
	alert(`${respuesta}`);
}
