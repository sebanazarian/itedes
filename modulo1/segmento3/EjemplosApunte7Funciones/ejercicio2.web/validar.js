function validar(){
	
	let resultado;
	for(let i=0; i<100000000; i++){
		resultado =	resultado + i;
		}
	console.log(resultado);
	document.getElementById('parrafo').innerHTML=resultado;
}
