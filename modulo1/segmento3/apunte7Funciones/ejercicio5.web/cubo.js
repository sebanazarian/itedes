function cubo(){
 	let num = parseInt(document.getElementById('num').value);
	let result=num;
	
	for(let i=0;i<=1;i++){
		result *=num
	}
	document.getElementById('parrafo').innerHTML=`${result}`;
}
