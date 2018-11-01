#!/bin/bash

declare number=""
declare respuesta=""
read -p "Ingrese un numero romano: " number


case ${number^^} in
	I)
		respuesta="1"
		;;
	V)
		respuesta="5"
		;;
	X)
		respuesta="10"
		;;
	L)
		respuesta="50"
		;;
	C)
		respuesta="100"
		;;
	D)
		respuesta="500"
		;;
	M)
		respuesta="1000"
		;;
	*)
		respuesta="Numero romano invalido"
		;;
esac
	echo "$respuesta $number"
exit 0
