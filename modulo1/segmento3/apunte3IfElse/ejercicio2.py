num = int(input("Ingrese un dia 1-Lunes,2-Martes,3-Miercoles,4-Jueves,5-Viernes,6-Sabado,7-Domingo: ") )

if( num == 1 ):
        opcion = "lunes"
elif (num == 2):
        opcion = "martes"
elif (num == 3):
        opcion = "miercoles"
elif (num == 4):
        opcion = "jueves"
elif (num == 5):
        opcion = "viernes"
elif (num == 6):
        opcion = "sabado"
elif (num == 7):
        opcion = "domingo"
else :
        opcion = "opcion incorrecta"
        num = 0

if (num == 0):
    print(opcion)
else:
    print("El dia elegido es "+  opcion)



