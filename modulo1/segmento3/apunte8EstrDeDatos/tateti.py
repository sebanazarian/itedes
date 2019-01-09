def dibujarTablero(tablero):
    import os
    os.system("clear")
    print(tablero[0] + '|' + tablero[1] + '|'+ tablero[2])
    print(tablero[3] + '|' + tablero[4] + '|'+ tablero[5])
    print(tablero[6] + '|' + tablero[7] + '|'+ tablero[8])

def quienEmpieza():
    from random import randrange
    if random.randrange(2)==0:
        return "El Jugador"
    else:
        return "Computadora"

def hayEspacio(tablero,casillero):
    return tablero[casillero]=="0"

def tableroCompleto(tablero):
    for i in range(len(tablero)):
        if hayEspacio(tablero,i):
            return False
    return True

def hacerJugada(tablero, letra, casillero):
    tablero[casillero] = letra

def ganador(tablero,letra):
    if (tablero[0]==letra and tablero[3]==letra and tablero[6]==letra) \
    or (tablero[0]==letra and tablero[4]==letra and tablero[8]==letra) \
    or (tablero[0]==letra and tablero[1]==letra and tablero[2]==letra) \
    or (tablero[1]==letra and tablero[4]==letra and tablero[7]==letra) \
    or (tablero[2]==letra and tablero[5]==letra and tablero[8]==letra) \
    or (tablero[3]==letra and tablero[4]==letra and tablero[5]==letra) \
    or (tablero[6]==letra and tablero[7]==letra and tablero[8]==letra) \
    or (tablero[6]==letra and tablero[4]==letra and tablero[2]==letra) \
    :
        return True

import random
#MAIN 
print("Bienvenidos al TATETI!!")
print("Posiciones del tateti")
print("-----------------------")
print("0|1|2")
print("3|4|5")
print("6|7|8")

tablero=['0','0','0','0','0','0','0','0','0']
inicioJuego=True
turno=quienEmpieza()
jugadasJugador=[]
jugadasPc=[]
while(inicioJuego):
    print(turno)
    if turno=="El Jugador":
        #Turno Jugador
        casillero = int(input("Ingrese la posicion deseada: "))
        jugada=hayEspacio(tablero,casillero)
        if jugada==True:
            hacerJugada(tablero,"X",casillero)
            dibujarTablero(tablero)
            jugadasJugador.append(casillero)
            if ganador(tablero,"X"):
                dibujarTablero(tablero)
                print("Sos el Ganador")                
                inicioJuego=False
            else:
                if tableroCompleto(tablero):
                    dibujarTablero(tablero)
                    print("Es un empate")
                    inicioJuego=False
                else:
                    turno="Computadora"
        else:
            print("Posicion Ocupada")

        
    else:
        #Turno computadora
        print("compu")
        from random import randrange
        casillero = randrange(len(tablero))
        jugada=hayEspacio(tablero,casillero)
        if jugada==True:
            hacerJugada(tablero,"C",casillero)
            dibujarTablero(tablero)
            jugadasJugador.append(casillero)
            if ganador(tablero,"C"):
                dibujarTablero(tablero)
                print("Gano la computadora")                
                inicioJuego=False
            else:
                if tableroCompleto(tablero):
                    dibujarTablero(tablero)
                    print("Es un empate")
                    inicioJuego=False
                else:
                    turno="El Jugador"
        else:
            print("Posicion Ocupada")