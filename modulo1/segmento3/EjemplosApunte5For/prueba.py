vertice = int(input("ingrese el tamaño: "))
print()


for i in range(1, vertice + 1):
	linea = ''
	
	for k in range(i):
		linea = linea + "x"
	
	print(linea)
