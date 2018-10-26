function validar(){
	
	number1 = document.getElementById("number1").value;
	number2 = document.getElementById("number2").value;
	number3 = document.getElementById("number3").value;
	number4 = document.getElementById("number4").value;
	
	if(number1==number2 ||  number3==number4){
		alert(`Son iguales`);
	}
}
