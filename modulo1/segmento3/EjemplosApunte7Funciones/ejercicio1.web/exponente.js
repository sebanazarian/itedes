function potenciar(base,exponente){
	resultado=base;

	for(i=1;i<exponente;i++){

		resultado=resultado*base;
	
	}
	return resultado;
}


function exponente(){
	
	num1 = parseInt(prompt("Base: "));
	num2 = parseInt(prompt("Exponente: "));

	resultado = potenciar(num1,num2);
	
	alert(`${resultado}`);
}

