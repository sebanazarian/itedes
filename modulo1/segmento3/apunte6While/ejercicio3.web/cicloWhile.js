function cicloWhile(){

	let area=0;
	let base=0;
	let altura=0;

	while(altura<=0 || base<=0){
		
		altura= parseInt(prompt("Ingrese altura: "));
		base= parseInt(prompt("Ingrese base: "));
		
	}	

	area = altura*base;
	alert(`${area}`);
}
