function validar(){
	
	number1 = document.getElementById("number1").value;

	resto = number1%2;

	if(resto != 0){
		alert(`${number1} no es multiplo de 2`);	
	}else{
		alert(`${number1} es multiplo de 2`);
	
	}
}
