lista=[]
lista2=[]

for i in range(5):
    numero=int(input("Ingrese un numero : "))
    lista.append(numero)

print(lista)


for i in range(len(lista)):
    lista2.append(lista[i]*2)

print("multiplicado",lista2)
