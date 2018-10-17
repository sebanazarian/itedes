function validar(){
	
	
	number1 = document.getElementById("number1").value;
	number2 = document.getElementById("number2").value;
	operacion = document.getElementById("operacion").value;

	
	if(operacion=="+"){
		var resultado= parseInt(number1) + parseInt(number2);
		alert(`El resultado de la suma es ${resultado}`);

	}else if(operacion=="-"){
		var resultado=parseInt(number1) - parseInt(number2);
		alert(`El resultado de la resta es ${resultado}`);

	}else if(operacion=="*"){
		var resultado=parseInt(number1) * parseInt(number2);
		alert(`El resultado de la multiplicacion es ${resultado}`);

	}else if(operacion=="/"){
		var resultado=parseInt(number1) / parseInt(number2);
		alert(`El resultado de la division es ${resultado}`);
	}
	
}
