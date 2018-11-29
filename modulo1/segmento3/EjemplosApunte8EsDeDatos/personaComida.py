def agregarPersonas(personas):
	comidas=[]
	persona={}
	seguir="si"
	persona['nombre']=input("Ingrese nombre de la persona: ")
	persona['apellido']=input("Ingrese apellido de la persona: ")
	while seguir=="si":
		persona['comida']= agregarComida(comidas)
		seguir=input("Desea agregar otra comida (si/no) ")

	personas.append(persona)

	return personas

def agregarComida(comidas):
	comida=input("Ingrese su comida favorita: ")
	comidas.append(comida)

	return comidas

def mostrarPersonas(personas):
	for p in personas:
		for key, value in p.items():
			print(key + ': ' + str(value))

def limpiar():
	os.system('clear')

#main
import os
personas=[]
opcionMenu=''
while opcionMenu !="0":
	print("1-Cargar Personas")
	print("2-Mostrar Personas")
	print("0-Salir")
	print("")
	opcionMenu=input("Ingrese la opcion deseada: ")
	
	opcion='si'
	if opcionMenu == "1":
		while opcion=='si':
			personas=agregarPersonas(personas)
			limpiar()
			opcion=input("Desea agregar otra persona: ")

	
	elif opcionMenu == "2":

		if not personas:
			limpiar()
			print("Debe cargar una persona")
			input("...pulsa una tecla para volver al menu principal")
			limpiar()
		else:
			limpiar()
			mostrarPersonas(personas)
			input("...pulsa una tecla para volver al menu principal")
			limpiar()

