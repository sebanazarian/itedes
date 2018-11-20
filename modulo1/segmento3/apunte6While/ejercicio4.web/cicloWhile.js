function cicloWhile(){

	let num=1;
	let total=0;
	while(num!=0){
		
		num= parseFloat(prompt("Ingrese un numero: "));
	 	total += num;	
	}	

	alert(`${total}`);
}
