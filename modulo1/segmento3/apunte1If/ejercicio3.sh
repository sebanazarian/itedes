#!/bin/bash

read -p "Ingrese su genero (M/F): " genero

if [ "$genero" == "F" ]
then
	echo "Es mujer"

elif [ "$genero" == "M" ]
then
	echo "Es hombre"
fi

exit 0
