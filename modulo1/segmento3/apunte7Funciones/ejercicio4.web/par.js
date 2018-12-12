function par(){
 	let num = parseInt(document.getElementById('num').value);
	let par;
	let respuesta;
	if(num%2==0){
		console.log("True");
		par=true;
	}else{
		console.log("False");
		par=false;
	}

	if(par){
		respuesta="Es un numero par";
		console.log(respuesta);
	}else{
		respuesta="Es un numero impar";
	}
	
	document.getElementById('parrafo').innerHTML=`${respuesta}`;
}
