def enviarMail(cuentaOrigen,subject,text):
	import smtplib
	
	listaDestinatarios=[]
	with open('listfile.txt', 'r') as filehandle:
		filecontents = filehandle.readlines()
		for line in filecontents:
			current_place = line[:-1]
			listaDestinatarios.append(current_place)

	# Gmail Sign In
	gmail_sender = cuentaOrigen['user']
	gmail_passwd = cuentaOrigen['pas']

	to = listaDestinatarios
	#to="sebanaza@hotmail.com"
	subject = subject
	text = text
	
	
	server = smtplib.SMTP(cuentaOrigen['smtp'], 587)
	server.ehlo()
	server.starttls()
	server.login(gmail_sender, gmail_passwd)
	
	body = '\r\n'.join(['To: %s' % to,
	                    'From: %s' % gmail_sender,
			            'Subject: %s' % subject, '', text])
	try:
	    server.sendmail(gmail_sender, [to], body)
	    print ('email sent')
	except:
	    print ('error sending mail')

	server.quit()


def cargarCuentaOrigen():	
	datosCuentaOrigen={}
	datosCuentaOrigen['user']=input("Ingrese su cuenta origen: ")
	datosCuentaOrigen['pas']=input("Ingrese su contrasena: ")
	datosCuentaOrigen['smtp']=input("SMTP: ")
		
	#ESCRIBE ARCHIVO CUENTA ORIGEN
	#with open('cuentaorigen.txt', 'w') as filehandle:  
	for clave, valor in datosCuentaOrigen.iteritems():
		print(clave,valor)

	return datosCuentaOrigen


def mostrarListaDestinatarios():
	
	listaDestinatarios=[]
	#LEER LISTA CARGADA
	print("Destinatarios: ")
	print("----------------")
	with open('listfile.txt', 'r') as filehandle:
		filecontents = filehandle.readlines()
		for line in filecontents:
			current_place = line[:-1]
			listaDestinatarios.append(current_place)
			print(current_place)
	print("----------------")
	
def cargarDestinatarios():
	listaDestinatarios=[]
	
	#LEER LISTA CARGADA
	with open('listfile.txt', 'r') as listaDesti:
		listaContenido = listaDesti.readlines()
		for line in listaContenido:
			current_place = line[:-1]
			listaDestinatarios.append(current_place)

	#CARGA DESTINATARIOS NUEVOS
	seguir="si"
	while seguir=="si":
		lista=input("Ingrese los destinatarios que desee: ")
		listaDestinatarios.append(lista)
		seguir=input("Desea agregar otro destinatario(si/no): ")

	#ESCRIBE ARCHIVO CON LOS DESTINATARIOS
	with open('listfile.txt', 'w') as filehandle:  
		filehandle.writelines("%s\n" % lista for lista in listaDestinatarios)

def encabezadoMenu():
	limpiarConsola()
	print("*************ENVIAR MAIL********")
	print("--------------------------------")
	print("--------------------------------")

def limpiarConsola():
	os.system('clear')
	print(" ")
	print(" ")

#MAIN
import os


option = ""
while option != "0":
	encabezadoMenu()
	print("1- Menu Destinatarios ")
	print("2- Configurar Cuenta Origen ")
	print("3- Enviar Mail ")
	print("0- Salir ")
	print(" ")
	option=input("Ingrese la opcion deseada: ")



	if option == "1":
		optionSubMenu=""
		datosCuentaOrigen={}
		while optionSubMenu !="0":
			print(" ")
			print(" ")
			print("1- Cargar destinatarios ")
			print("2- Mostrar Destinatarios ")
			print("0- Menu Principal ")
			optionSubMenu=input("Ingrese la opcion deseada: ")
			if optionSubMenu == "1":
				cargarDestinatarios()
				limpiarConsola()
			elif optionSubMenu== "2":
				limpiarConsola()
				mostrarListaDestinatarios()

	elif option == "2":
		datosCuentaOrigen=cargarCuentaOrigen()
		input("..datos cargados pulse una tecla para continuar")
	
	elif option == "3":
		if not datosCuentaOrigen:
			print("Por favor ingrese los datos de la cuenta origen ")
		else:
			enviarMail(datosCuentaOrigen,'hola','chau')
			input("...pulsa una tecla para continuar")

