frutas= ["banana","naranja","mandarina","manzana"]
frutas.append("pomelo")

for fruta in frutas:
	print(fruta)

cantidadElementos=len(frutas)
print(cantidadElementos)
print(frutas[1])

del frutas[1]

for fruta in frutas:
	print(fruta)
