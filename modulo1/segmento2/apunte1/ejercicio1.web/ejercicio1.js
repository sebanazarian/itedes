function saludar(){
	
	const barrio = prompt('Ingrese su barrio');
	const direccion = prompt('Ingrese la direccion de la comisaria mas cercana: ');
	const entrecalle1 = prompt('Ingrese entrecalle1: ');
	const entrecalle2 = prompt('Ingrese entrecalle2: ');
	
	alert(`La comisaria de  ${barrio} esta en la direccion ${direccion} entre la calle ${entrecalle1} y ${entrecalle2}`);
}
