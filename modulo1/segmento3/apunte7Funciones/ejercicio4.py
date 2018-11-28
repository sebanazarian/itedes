def par(num1):
	
	if num1%2 == 0:
		respuesta= True
	else:
		respuesta= False
	
	return respuesta

num1=int(input("Ingrese un numero: " ))

respuesta= par(num1)
if respuesta:
	print("El numero ingresado es par")
else:
	print("El numero ingresado es impar")
		
