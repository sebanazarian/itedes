function multiplos(){
	let num = parseInt(document.getElementById('num').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let respuesta='';
	if(num%num2==0){
		respuesta=`${num} es multiplo de ${num2}`;
	}else if(num2%num==0){
		respuesta=`${num2} es multiplo de ${num}`;
	}else{
		respuesta=`No son multiplos`
	}
	
	
	document.getElementById('parrafo').innerHTML=respuesta;
}
