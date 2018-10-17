number1 = int(input("ingrese un numero: "))
number2 = int(input("ingrese otro numero: "))

operacion =input("ingrese la operacion a realizar(+,-,* o /): ")

if operacion == "+":
	resultado = number1 + number2
	print("El resultado de la suma es " + str(resultado))
elif operacion =="-":
	resultado = number1 - number2
	print("El resultado de la resta es " + str(resultado))
elif operacion =="*":
	resultado = number1 * number2
	print("El resultado de la multiplicacion es " + str(resultado))
elif operacion=="/":
	resultado = number1 / number2
	print("El resultado de la division es " + str(resultado))
