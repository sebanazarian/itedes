#!/bin/bash
function par(){
	if (( $1%2==0 ))
	then
		respuesta="1"
	else
		respuesta="0"
	fi
	echo $respuesta
}

declare -i number=0

read -p "Ingrese un numero: " number

respuesta=$(par $number)

if (( $respuesta=="1"))
then
	echo "El numero ingresado es par "
else
	echo "El numero ingresado es impar"
fi

exit 0
