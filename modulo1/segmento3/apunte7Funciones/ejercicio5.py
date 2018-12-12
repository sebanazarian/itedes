def cubo(num1):
	result=num1
	for i in range(1,3):
		result*=num1
	return result

num1=int(input("Ingrese un numero: " ))

respuesta= cubo(num1)

print(str(num1) +" elevado al cubo es igual a: " + str(respuesta))
		
