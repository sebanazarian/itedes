def divisores(num):
	cantidad=0
	for i in range(1,num+1):
		if num%i==0:
			cantidad+=1
	return cantidad

num=int(input("Ingrese un numero: "))
canti=divisores(num)

print(canti)
