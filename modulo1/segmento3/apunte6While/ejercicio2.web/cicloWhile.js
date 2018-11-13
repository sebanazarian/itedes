function cicloWhile(){

	let confirma=`S`

	while(confirma==`S`){
		
		let number1= parseInt(prompt("ingrese un numero: "));
		let number2= parseInt(prompt("ingrese un numero: "));
		let resultado = number1+number2;
		
		alert(`${resultado}`);
		
		confirma = prompt("Desea continuar(s/n): ").toUpperCase();
		//confirma=confirma.toUpperCase()
	}	
}
