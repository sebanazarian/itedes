miListaImpar=[]

for i in range(100):
    if i%2 !=0:
        miListaImpar.append(i)

for i in  range(len(miListaImpar)):
    for k in range(i,len(miListaImpar)):
            if miListaImpar[i]<miListaImpar[k]:
                aux = miListaImpar[k]
                miListaImpar[k]=miListaImpar[i]
                miListaImpar[i]=aux

print(miListaImpar)