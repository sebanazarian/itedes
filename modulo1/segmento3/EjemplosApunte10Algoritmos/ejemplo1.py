import random


num =[]
for i in range(100):
		num.append(random.randint(1, 100))
#num.sort()	
print("Sin ordenar")
print(num)

# Burbujeo

for i in range(len(num)):
		for k in range(i,len(num)):
				if num[i]>num[k]:
					aux=num[k]
					num[k]=num[i]
					num[i]=aux

print("Ordenado de Menor a Mayor")
print(num)

for i in range(len(num)):
		for k in range(i,len(num)):
				if num[i]<num[k]:
					aux=num[k]
					num[k]=num[i]
					num[i]=aux

print("Max a Menor")
print(num)
