
base = int(input("Ingrese la base deseada: "))
altura = int(input("Ingrese la altura deseada: "))

for i in range(0,altura,1):
	linea=""
	for j in range(0,base,1):
		linea+= "x"

	print(linea)
