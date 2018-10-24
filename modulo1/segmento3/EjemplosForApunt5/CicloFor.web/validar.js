function validar(){
	let texto = '';

	for(let i= 0; i<=99; i++){
		texto += `${i.toString()} <br>`; 
	}
	
	document.getElementById('for').innerHTML= texto;
}

function borrar(){
	let texto = ''
		document.getElementById('for').innerHTML= texto;
}
