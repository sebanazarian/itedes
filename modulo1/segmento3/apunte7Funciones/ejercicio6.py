def sumar(num1,num2):
	total=0
	total = num1 + num2
	return total

def restar(num1,num2):
	total=0
	total = num1 - num2
	return total

def dividir(num1,num2):
	total=0
	total = num1 / num2
	return total

def multiplicar(num1,num2):
	total=0
	total = num1 * num2
	return total

def limpiar():
	os.system('clear')

def potencia(num1,num2):
	total=num1
	for i in range(1,num2):
		total*=num1
	
	return total
#main
import os
num1=0
num2=0
opcionMenu=''
while opcionMenu !="0":
	print("1-Suma")
	print("2-Resta")
	print("3-Dividir")
	print("4-Multiplicacion")
	print("5-Potencia")
	print("")
	opcionMenu=input("Ingrese la opcion deseada: ")
	
	if opcionMenu == "1":
		limpiar()
		num1=int(input("Ingrese un numero: "))
		num2=int(input("Ingrese un numero: "))
		total=sumar(num1,num2)
		print("El resultado de la suma es: " + str(total))
	elif opcionMenu == "2":
		limpiar()
		num1=int(input("Ingrese un numero: "))
		num2=int(input("Ingrese un numero: "))
		total=restar(num1,num2)
		print("El resultado de la resta es: " + str(total))
	elif opcionMenu == "3":
		limpiar()
		num1=int(input("Ingrese un numero: "))
		num2=int(input("Ingrese un numero: "))
		total=dividir(num1,num2)
		print("El resultado de la division es: " + str(total))
	elif opcionMenu == "4":
		limpiar()
		num1=int(input("Ingrese un numero: "))
		num2=int(input("Ingrese un numero: "))
		total=multiplicar(num1,num2)
		print("El resultado de la multiplicacion es: " + str(total))
	elif opcionMenu == "5":
		limpiar()
		num1=int(input("Ingrese un numero: "))
		num2=int(input("Ingrese el exponente: "))
		total=potencia(num1,num2)
		print("El resultado de la potencia es: " + str(total))
