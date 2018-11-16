function divisores(){
	let num = parseInt(document.getElementById('num').value);
	let cantDivisores=0;
	let text='';
	for (i=1;i<=num;i++){
		if(num%i==0){
			cantDivisores+=1;
		}
	}
	
	text=`Cantidad de Divisores: ${cantDivisores.toString()}`;
	document.getElementById('parrafo').innerHTML=text;
}
