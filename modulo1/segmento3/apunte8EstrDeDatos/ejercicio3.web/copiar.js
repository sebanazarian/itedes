function copiarLista(){
	let lista1=[];
	let lista2=[];
	
	for(i=0;i<5;i++){
		lista1.push(parseInt(prompt("Ingrese un numero: ")));
	}

	alert(lista1);

	for(i=0;i<lista1.length;i++){
		lista2.push(parseInt(lista1[i]*2))
	}

	alert(lista2);
	

}
