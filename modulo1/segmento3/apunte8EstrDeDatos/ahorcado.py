
def generarBaseDatos():
	seguir="si"
	listas=[]

	while seguir=="si":
		lista=input("Ingrese las palabras para jugar: ")
		listas.append(lista)

		seguir=input("Desea agregar otra palabra(si/no)")
	return listas

def sortear(lista):
	from random import randrange
	random = randrange(len(lista))
	return listaJuego[random]

#MAIN
print("*************AHORCADO********")
print("-----------------------------")
print("-----------------------------")
listaJuego=generarBaseDatos()

palabra=sortear(listaJuego)
#CONVIERTO PALABRA EN LISTA
Palabra=list(palabra)
#INICIALIZO VARIABLES 
vidas=6
faltan=len(Palabra)
PalabraMostrar=[]

#CREO LISTA VACIA
for i in range(len(Palabra)):
	PalabraMostrar.append('-')

while vidas>0 and faltan>0:
	print(PalabraMostrar) #muestro lista vacia
	letra=input("Ingrese una letra: ")
	
	if letra in Palabra:
		faltan=faltan - Palabra.count(letra) # resto la cantidad de veces que aparece la letra
		print("Letras Restantes:",faltan)
		
		for i in range(len(Palabra)):
			if Palabra[i] == letra:
				PalabraMostrar[i] = letra
	else:
		vidas= vidas-1
		print("Vidas: " , vidas)
	
if faltan==0:
	print("***********GANASTE!!!!!!")
	print("La palabra es :", palabra)
elif vidas==0:
	print("Perdio!!!")
