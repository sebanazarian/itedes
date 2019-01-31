import random


num =[]
for i in range(100):
		num.append(random.randint(1, 100))
#num.sort()	

# Burbujeo

for i in range(len(num)):
		for k in range(i,len(num)):
				if num[i]>num[k]:
					aux=num[k]
					num[k]=num[i]
					num[i]=aux

print("Menor a Mayor")
print(num)
