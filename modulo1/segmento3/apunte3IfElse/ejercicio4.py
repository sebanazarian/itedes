letra = input("Ingrese un numero romano");


if (letra == "I"):
	numero = 1
elif (letra == "V"):
	numero = "5"
elif (letra == "X"):
	numero = "10"
elif (letra == "L"):
	numero = "50"
elif (letra == "C"):
	numero = "100"
else:
	numero = "Error numero romano no valido"

print("El numero romano en decimal es : "+ str(numero))
