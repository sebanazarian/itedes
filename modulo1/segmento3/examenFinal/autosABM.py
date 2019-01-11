def agregarAutos(autos):
	auto={}
	patente = input("Ingrese patente del Auto: ")
	patenteDuplicada = verificarPatente(patente)
	while patenteDuplicada=="si":
		print("Patente Existente ingrese nuevamente")
		patente = input("Ingrese patente del Auto: ")
		patenteDuplicada=verificarPatente(patente)

	auto['patente']= patente
	auto['marca']=input("Ingrese marca del Auto: ")
	auto['modelo']=input("Ingrese modelo del Auto: ")
	auto['color']=input("Ingrese color del Auto: ")
	autos.append(auto)

	return autos

def verificarPatente(patenteAuto):
	for auto in autos:
		if auto['patente']==patenteAuto:
			return "si"
	return "no"

def modificarAutoxPatente(autos,patenteAuto):
	i=0
	contador=0
	for auto in autos:
		if auto['patente']==patenteAuto:
			opcionMenuModificar=''
			while opcionMenuModificar !="0":
				print("1-Modificar Pantente")
				print("2-Modificar Marca")
				print("3-Modificar modelo")
				print("4-Modificar Color")
				print("0-Salir")
				print("")
				opcionMenuModificar=input("Ingrese la opcion deseada: ")
			
				if opcionMenuModificar== "1":
					patente = input("Ingrese patente del auto: ")
					patenteDuplicada = verificarPatente(patente)
					while patenteDuplicada=="si":
						print("Patente Existente ingrese nuevamente")
						patente = input("Ingrese patente del Auto: ")
						patenteDuplicada=verificarPatente(patente)
					autos[i]['patente'] = patente	

				elif opcionMenuModificar== "2":
					autos[i]['marca'] = input("Ingrese marca del auto: ")
				elif opcionMenuModificar=="3":	
					autos[i]['modelo'] = input("Ingrese modelo del auto: ")
				elif opcionMenuModificar=="4":	
					autos[i]['color'] = input("Ingrese color del auto: ")
				contador= contador +1
		i=i+1
	if contador == 0:
		print("No existe el auto")
		

def eliminarAuto(autos,patenteAuto):
	contador=0
	i=0
	for auto in autos:
		if auto['patente']==patenteAuto:
			del autos[i]
			contador= contador +1
		i=i+1
	if contador == 0:
		print("No existe el auto")

def escribirArchivo(listaAutos):
		with open('listAutos.txt', 'w') as fileAutos:
	 		fileAutos.writelines("%s\n" % lista for lista in listaAutos )

def limpiar():
	os.system('clear')
#main
import os
autos=[]
opcionMenu=''

while opcionMenu !="0":
	print("1-Cargar Auto")
	print("2-Modificar Auto")
	print("3-Baja de Auto")
	print("4-Mostrar Lista")
	print("0-Salir")
	print("")
	opcionMenu=input("Ingrese la opcion deseada: ")

	opcion='si'
	if opcionMenu == "1":
			while opcion!='no':
				autos=agregarAutos(autos)
				limpiar()
				opcion=input("Desea agregar otro auto: ")
			
			escribirArchivo(autos)
	elif opcionMenu=="2":
		print("2")
		patenteAuto=input("Ingresela patente del auto a modificar: ")
		modificarAutoxPatente(autos,patenteAuto)
	elif opcionMenu=="3":
		patenteAuto=input("Ingresela patente del auto a eliminar: ")
		eliminarAuto(autos,patenteAuto)
	elif opcionMenu=="4":
		print(autos)

	
	
	

	