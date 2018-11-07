function validar(){
	
 	let text='';
	let text2=``;
	let max= parseInt(prompt("Ingrese un maximo"));

	for(i= 0; i<max; i++){
		for(let j=0; j<i; j++){
			text += `x`;
			console.log(text);
		}
		text += `<br>`;
	}
	
	for(let j=i-1; j>0; j--){
		for(let k=0;k<j;k++){
			text2+= `x`;
		}
		text2+=`<br>`;
	
	}

	document.getElementById('parrafo').innerHTML=text+text2;
}
