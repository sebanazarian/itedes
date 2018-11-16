function cicloWhile(){

	let num=1;
	let maximo=0;

	while(num!=0){
		
		num= parseInt(prompt("Ingrese un numero: "));
		if (num>=maximo){
			maximo=num;
		}	
	}	

	alert(`${maximo}`);
}
