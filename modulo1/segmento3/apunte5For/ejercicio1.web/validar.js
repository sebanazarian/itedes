function validar(){
	
	let text='';
	
	num = parseInt(document.getElementById('num').value);
	
	for(let i= 0; i<=11; i++){
		resultado =	i*num;
		text +=  `${num.toString()} x ${i.toString()} = ${resultado} <br>`;
		//text +=` ${i.toString()} Hola`;
	}

	document.getElementById('parrafo').innerHTML=text;
}
