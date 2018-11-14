seguir="si"
productos=[]

while seguir=="si":
	producto=input("Ingrese el producto que desa comprar: ")
	productos.append(producto)

	seguir=input("Desea agregar otro producto(si/no)")

for producto in productos:
	print(producto)

