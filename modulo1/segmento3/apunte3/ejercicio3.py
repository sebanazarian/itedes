car = input("ingrese un caracter cualquiera: ")

if (car == "a" or car == "e" or car == "i" or car == "o" or car == "u" ):
    opcion = "vocal"
elif (car.isdigit()):
    opcion = "numero"
else :
    opcion = "consonante"

print (opcion)


