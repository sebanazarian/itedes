def maximo(num1,num2,num3):
	
	if num1>=num2:
		maximo= num1
	else:
		maximo=num2
	
	if num3>= maximo:
		maximo=num3
	else:
		maximo=maximo
	
	return maximo

num1=int(input("Ingrese un numero: " ))
num2=int(input("Ingrese un numero: " ))
num3=int(input("Ingrese un numero: " ))

respuesta= maximo(num1,num2,num3)
print("Maximo: "+  str(respuesta))
		
