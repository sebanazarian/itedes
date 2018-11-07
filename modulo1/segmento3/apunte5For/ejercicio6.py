linea=""
vueltasi= int(input("Ingrese el maximo"))

for i in range(vueltasi):
	linea = linea + "x"
	print(linea)

for i in reversed(range(vueltasi - 1)):
	linea=""
	for j in range(i):
		linea = linea + "x"

	print(linea)
