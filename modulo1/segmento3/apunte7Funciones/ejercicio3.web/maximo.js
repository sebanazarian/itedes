function maximo(){
	let num = parseInt(document.getElementById('num').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let num3 = parseInt(document.getElementById('num3').value);
	let maximo
	if(num>=num2){
		maximo=`${num}`;
	}else{
		maximo=`${num2}`;
	}
	if (num3>=maximo){
		maximo=`${num3}`
	}
	
	
	document.getElementById('parrafo').innerHTML=`Maximo: ${maximo}`;
}
