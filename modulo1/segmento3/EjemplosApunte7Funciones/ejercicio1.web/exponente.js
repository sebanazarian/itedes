function potenciar(base,exponente){
	let resultado=base;

	for(i=1;i<exponente;i++){

		resultado=resultado*base;
	
	}
	return resultado;
}


function exponente(){
	
	let num1 = parseInt(prompt("Base: "));
	let num2 = parseInt(prompt("Exponente: "));

	let resultado = potenciar(num1,num2);
	
	alert(`${resultado}`);
}

