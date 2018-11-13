#!/bin/bash

declare seguir="s"
declare -i total=0


while [ $seguir == "s" ]; do
	read -p"Ingrese un numero: " number
	read -p"Ingrese un numero: " number2
	total=$number+$number2
	echo "$total"

	read -p "¿Desea Continuar(s/n)? " seguir
done

exit 0
