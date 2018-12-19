function potencia(){
	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let result=num1;
	
	for(let i=1;i<num2;i++){
		result *=num1
	}
	document.getElementById('parrafo').innerHTML=`${result}`;
}

function sumar(){
	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let result=num1;
	
	result=num1+num2;
	document.getElementById('parrafo').innerHTML=`El resultado es: ${result}`;
}
function restar(){
	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let result=num1;
	
	result=num1-num2;
	document.getElementById('parrafo').innerHTML=`El resultado es: ${result}`;
}

function multiplicar(){
	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let result=num1;
	
	result=num1*num2;
	document.getElementById('parrafo').innerHTML=`El resultado es: ${result}`;
}

function dividir(){
	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let result=num1;
	
	result=num1/num2;
	document.getElementById('parrafo').innerHTML=`El resultado es: ${result}`;
}