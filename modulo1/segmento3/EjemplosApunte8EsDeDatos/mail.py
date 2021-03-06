def enviarMail(listaDestinatarios,dataOriginAccount,subject,text):
	import smtplib
	
	# Gmail Sign In
	gmail_sender = dataOriginAccount['user']
	gmail_passwd = dataOriginAccount['pas']

	to = listaDestinatarios
	#to="sebanaza@hotmail.com"
	subject = subject
	text = text
	print(to)
	input("..datos cargados pulse una tecla para continuar")
	
	
	server = smtplib.SMTP(dataOriginAccount['smtp'], 587)
	server.ehlo()
	server.starttls()
	server.login(gmail_sender, gmail_passwd)
	
	body = '\r\n'.join(['To: %s' % to,
	                    'From: %s' % gmail_sender,
			            'Subject: %s' % subject, '', text])
	
	for destinatario in listaDestinatarios:
		try:
		    server.sendmail(gmail_sender, destinatario, body)
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
	
def saveListDestinatarios(listaDestinatarios):

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
	

def saveFileDestinatarios(listaDestinatarios):
	with open('fileDestinatarios.json','w') as fileOut:
		json.dump(listaDestinatarios,fileOut)

def loadFileDestinatarios(listaDestinatarios):
	if path.exists('fileDestinatarios.json'):
		print("EXISTE ARCHIVO")
		#LEER LISTA CARGADA
		with open('fileDestinatarios.json', 'r') as fileIn:
			listaDestinatarios = json.load(fileIn)
	else:	
		print("NO EXISTE ARCHIVO")
	return listaDestinatarios

def loadFileOrigen(dataOriginAccount):
	if path.exists('fileOriginAccount.json'):
		print("EXISTE ARCHIVO")
		#LEER LISTA CARGADA
		with open('fileOriginAccount.json', 'r') as fileIn:
			dataOriginAccount = json.load(fileIn)
	else:	
		print("NO EXISTE ARCHIVO")

	return dataOriginAccount

def saveObjectAccount():	
	dataOriginAccount = {}

	dataOriginAccount['user']=input("Ingrese su cuenta origen: ")
	dataOriginAccount['pas']=input("Ingrese su contrasena: ")
	dataOriginAccount['smtp']=input("SMTP: ")
		
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

print(dataOriginAccount)
print(listaDestinatarios)

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
		if not dataOriginAccount:
			print("Por favor ingrese los datos de la cuenta origen y/o destinatarios ")
		else:
			subject=input("Ingrese el asunto del mensaje ")
			text=input("Ingrese el mensaje del mail: ")
			enviarMail(listaDestinatarios,dataOriginAccount,subject,text)
			input("...pulsa una tecla para continuar")
	elif option=="0":
		saveFileDestinatarios(listaDestinatarios)
		saveFileOriginAccount(dataOriginAccount)

