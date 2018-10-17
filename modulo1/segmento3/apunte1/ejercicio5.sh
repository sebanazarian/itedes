#!/bin/bash

read -p "Ingrese su genero: " genero
read -p "Ingrese su edad: " edad

if [ "$genero" == "M" ] && [ "$edad" -ge 18 ]
then
	echo "El usuario es Masculino y mayor de 18 años"
fi
exit 0
