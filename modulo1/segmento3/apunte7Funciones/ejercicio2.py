def multiplos(num1,num2):
	respuesta=""
	if num1%num2==0:
		respuesta= str(num1) + " es multiplo de " + str(num2)
	elif num2%num1==0:
		respuesta= str(num2) + " es multiplo de " + str(num1)
	else :
		respuesta="Los numeros ingresados no son multiplos"
	
	return respuesta

num1=int(input("Ingrese un numero: " ))
num2=int(input("Ingrese un numero: " ))

print(multiplos(num1,num2))
		
