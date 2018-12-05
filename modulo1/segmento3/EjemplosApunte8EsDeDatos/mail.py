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




def loadListDestinatarios(listaDestinatarios):
	#LEER LISTA CARGADA
	print("Destinatarios: ")
	print("----------------")
	print(listaDestinatarios)
	print("----------------")
	
	#with open('listDestinatarios.json', 'r') as filehandle:
	#	filecontents = filehandle.readlines()
	#	for line in filecontents:
	#		current_place = line[:-1]
	#		listaDestinatarios.append(current_place)
	#		print(current_place)
	
def saveListDestinatarios(listaDestinatarios):
	#LEER LISTA CARGADA
	#with open('listDestinatarios.json', 'r') as listaDesti:
	#	listaContenido = listaDesti.readlines()
	#	for line in listaContenido:
	#		current_place = line[:-1]
	#		listaDestinatarios.append(current_place)

	#CARGA DESTINATARIOS NUEVOS
	seguir="si"
	while seguir!="no":
		lista=input("Ingrese los destinatarios que desee: ")
		if lista in listaDestinatarios:		
			print("El destinatario ya existe")
		else:
			listaDestinatarios.append(lista)

		seguir=input("Desea agregar otro destinatario(si/no): ")

	return listaDestinatarios
	
	#ESCRIBE ARCHIVO CON LOS DESTINATARIOS
	#with open('listDestinatarios.json', 'w') as filehandle:  
		#filehandle.writelines("%s\n" % lista for lista in listaDestinatarios)

def saveFileDestinatarios(listaDestinatarios):
	with open('fileDestinatarios.json','w') as fileOut:
		json.dump(listaDestinatarios,fileOut)

def loadFileDestinatarios(listaDestinatarios):
	if path.exists('fileDestinatarios.json'):
		print("EXISTE ARCHIVO")
		#LEER LISTA CARGADA
		with open('fileDestinatarios.json', 'r') as fileIn:
			listaDestinatarios = json.load(fileIn)
		#for line in listaDestinatarios:
			#current_place = line[:-1]
			#listaDestinatarios.append(current_place)
	else:	
		print("NO EXISTE ARCHIVO")
	return listaDestinatarios

def loadFileOrigen(dataOriginAccount):
	if path.exists('fileOriginAccount.json'):
		print("EXISTE ARCHIVO")
		#LEER LISTA CARGADA
		with open('fileDestinatarios.json', 'r') as fileIn:
			dataOriginAccount = json.load(fileIn)
		#for line in listaDestinatarios:
			#current_place = line[:-1]
			#listaDestinatarios.append(current_place)
	else:	
		print("NO EXISTE ARCHIVO")

	return dataOriginAccount

def saveObjectAccount():	
	dataOriginAccount = {}

	dataOriginAccount['user']=input("Ingrese su cuenta origen: ")
	dataOriginAccount['pas']=input("Ingrese su contrasena: ")
	dataOriginAccount['smtp']=input("SMTP: ")
		
	#ESCRIBE ARCHIVO CUENTA ORIGEN
	#with open('cuentaorigen.txt', 'w') as filehandle:  
	#for clave, valor in datosCuentaOrigen.iteritems():
	#	print(clave,valor)

	return dataOriginAccount

def saveFileOriginAccount(dataOriginAccount):
	with open('fileOriginAccount.json','w') as fileOut:
		json.dump(dataOriginAccount,fileOut)

def headerMenu():
	clearConsole()
	print("*************ENVIAR MAIL********")
	print("--------------------------------")
	print("--------------------------------")

def clearConsole():
	os.system('clear')
	print(" ")
	print(" ")

#MAIN
import os
import json
import os.path as path

listaDestinatarios=[]
dataOriginAccount={}
#LOAD LIST Destinatarios
listaDestinatarios=loadFileDestinatarios(listaDestinatarios)
#LOAD DICTIONARY Account
dataOriginAccount=loadFileOrigen(dataOriginAccount)

option = ""
while option != "0":
	headerMenu()
	print("1- Menu Destinatarios ")
	print("2- Configurar Cuenta Origen ")
	print("3- Enviar Mail ")
	print("0- Salir ")
	print(" ")
	option=input("Ingrese la opcion deseada: ")
	
	if option == "1":
		optionSubMenu=""
		while optionSubMenu !="0":
			print(" ")
			print(" ")
			print("1- Cargar destinatarios ")
			print("2- Mostrar Destinatarios ")
			print("0- Menu Principal ")
			optionSubMenu=input("Ingrese la opcion deseada: ")
			if optionSubMenu == "1":
				listaDestinatarios=saveListDestinatarios(listaDestinatarios)
				clearConsole()
			elif optionSubMenu== "2":
				clearConsole()
				loadListDestinatarios(listaDestinatarios)

	elif option == "2":
		dataOriginAccount=saveObjectAccount()
		input("..datos cargados pulse una tecla para continuar")
	
	elif option == "3":
		if not datosCuentaOrigen:
			print("Por favor ingrese los datos de la cuenta origen ")
		else:
			enviarMail(datosCuentaOrigen,'hola','chau')
			input("...pulsa una tecla para continuar")
	elif option=="0":
		saveFileDestinatarios(listaDestinatarios)
		saveFileOriginAccount(dataOriginAccount)

