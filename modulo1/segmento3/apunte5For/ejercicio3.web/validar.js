function validar(){
	
	let resultado=0;
 	let text='';	
	for(let i= 0; i<=100; i++){
		resultado=resultado+i;
		text +=  `${resultado.toString()}<br>`;
		
	}

	document.getElementById('parrafo').innerHTML=text;
}
