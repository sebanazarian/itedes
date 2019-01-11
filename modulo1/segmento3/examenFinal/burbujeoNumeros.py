
seguir="si"
numeros=[]

while seguir=="si":
	numero=int(input("Ingrese el numero que desee: "))
	numeros.append(numero)

	seguir=input("Desea agregar otro numero(si/no)")

# # Burbujeo
for i in range(len(numeros)):
	for k in range(i,len(numeros)):
			if numeros[i]<numeros[k]:
				aux=numeros[k]
				numeros[k]=numeros[i]
				numeros[i]=aux

print("Ordenado de Menor a Mayor")
print(numeros)