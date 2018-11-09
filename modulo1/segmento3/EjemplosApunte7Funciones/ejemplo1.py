def exponencia(base,exponente):
	resultado=base

	for i in range(1,exponente):
		resultado= resultado*base
	return resultado

base = int(input("base: "))
exponente = int(input("exponente: "))
resultado= exponencia(base,exponente)

print(resultado)
