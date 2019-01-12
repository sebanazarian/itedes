function impar(){
	let listaImpar=[];
	let aux='';
	let text='';
	for(i=0;i<=100;i++){
		if(i%2!=0){
			console.log(i);
			listaImpar.push(i);
			text+= `${i.toString()}<br>`;
		}
	}

	for(i=0;i<=listaImpar.length-1;i++){
		for(k=i+1;k<=listaImpar.length;k++){
			if (listaImpar[i]<listaImpar[k]){
				aux=listaImpar[k];
				listaImpar[k]=listaImpar[i];
				listaImpar[i]=aux;
			}
		}
	}
	document.getElementById('parrafo').innerHTML=`${listaImpar}`;
}
