function validar(){
			
		//numero= document.getElementsByName("number")[0].value;
		numero= document.getElementById("number").value;
		if (numero == 10){
		
			alert(`El numero es ${numero}`);
		}else{
			alert(`El numero es distinto a 10`);
		}
}


