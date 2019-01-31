def agregarAlumnos(alumnos):
	persona={}
	persona['nombre']=input("Ingrese nombre de Alumno: ")
	persona['apellido']=input("Ingrese apellido de Alumno: ")
	persona['dni']=input("Ingrese dni de Alumno: ")
	persona['direccion']=input("Ingrese direccion de Alumno: ")
	persona['telefono']=input("Ingrese telefono de Alumno: ")
	persona['mail']=input("Ingrese mail de Alumno: ")
	persona['fechanac']=input("Ingrese Fecha de Nacimiento de Alumno: ")
	alumnos.append(persona)

	return alumnos

def mostrarAlumnos(alumnos):
	for alumno in alumnos:
		for key, value in alumno.items():
			print(key + ': ' + str(value))

def buscarAlumnosxDni(alumnos,dni):
	contador=0
	for alumno in alumnos:
		if alumno['dni']==dni:
			print("Nombre: " + alumno['nombre'])
			print("Apellido: " +alumno['apellido'])
			print("DNI: " + alumno['dni'])
			print("Direccion: " + alumno['direccion'])
			print("Telefono: " + alumno['telefono'])
			print("Mail: " + alumno['mail'])
			print("Fecha de Nacimiento: " + alumno['fechanac'])
			contador= contador +  1
	if contador == 0:
		print("No existe el alumno")

def escribirArchivo(listaAlumnos):
		with open('listAlumnos.py', 'w') as fileAlumnos:
	 		fileAlumnos.writelines("%s\n" % lista for lista in listaAlumnos )
def eliminarAlumnosxApellido(alumnos,apellido):
    contador=0;
    i=0;
    for alumno in alumnos:
        if alumno['apellido']==apellido:
            del alumnos[i];
            contador=contador +1;
            print("Alumno Eliminado");
        i=i+1;
    if contador==0:
        print("El alumno no existe");

def eliminarAlumnosxDni(alumnos,dni):
    contador=0;
    i=0;
    for alumno in alumnos:
        if alumno['dni']==dni:
            del alumnos[i];
            contador = contador +1;
            print("Alumno Eliminado");
        i=i+1;
    if contador==0:
        print("El alumno no existe");

def buscarAlumnosxApellido(alumnos,apellido):
	contador=0
	for alumno in alumnos:
		if alumno['apellido']==apellido:
			print("Nombre: " + alumno['nombre'])
			print("Apellido: " +alumno['apellido'])
			print("DNI: " + alumno['dni'])
			print("Direccion: " + alumno['direccion'])
			print("Telefono: " + alumno['telefono'])
			print("Mail: " + alumno['mail'])
			print("Fecha de Nacimiento: " + alumno['fechanac'])
			contador= contador +  1
	
	if contador == 0:
		print("No existe el alumno")

def limpiar():
	os.system('clear')

#main
import os
alumnos=[]
opcionMenu=''
while opcionMenu !="0":
	print("1-Cargar Alumnos")
	print("2-Mostrar Alumnos")
	print("3-Busqueda por DNI")
	print("4-Busqueda por apellido")
	print("5-Eliminar por apellido")
	print("6-Eliminar por dni")
	print("0-Salir")
	print("")
	opcionMenu=input("Ingrese la opcion deseada: ")
	
	opcion='si'
	if opcionMenu == "1":
		while opcion!='no':
			alumnos=agregarAlumnos(alumnos)
			limpiar()
			opcion=input("Desea agregar otro alumno: ")

		escribirArchivo(alumnos)
	
	elif opcionMenu == "2":

		if not alumnos:
			limpiar()
			print("Debe cargar un alumno minimo")
			input("...pulsa una tecla para volver al menu principal")
			limpiar()
		else:
			limpiar()
			mostrarAlumnos(alumnos)
			input("...pulsa una tecla para volver al menu principal")
			limpiar()

	elif opcionMenu == "3":
			limpiar()
			dni=input("Ingrese el dni del alumno ")
			buscarAlumnosxDni(alumnos,dni)
			input("...pulsa una tecla para volver al menu principal")
			limpiar()

	elif opcionMenu == "4":
			limpiar()
			apellido=input("Ingrese el apellido del alumno ")
			buscarAlumnosxApellido(alumnos,apellido)
			input("...pulsa una tecla para volver al menu principal")
			limpiar()
	elif opcionMenu == "5":
			limpiar()
			apellido=input("Ingrese el apellido del alumno ")
			eliminarAlumnosxApellido(alumnos,apellido)
			input("...pulsa una tecla para volver al menu principal")
			limpiar()
	elif opcionMenu == "6":
			limpiar()
			dni=input("Ingrese el dni del alumno ")
			eliminarAlumnosxDni(alumnos,dni)
			input("...pulsa una tecla para volver al menu principal")
			limpiar()
