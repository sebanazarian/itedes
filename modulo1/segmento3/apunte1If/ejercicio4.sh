#!/bin/bash

read -p "Ingrese un numero: " number1
read -p "Ingrese un numero: " number2
read -p "Ingrese un numero: " number3
read -p "Ingrese un numero: " number4

if [[ "$number1" == "$number2" || "$number3" == "$number4" ]]
then
	echo "Son iguales"

fi
exit 0
