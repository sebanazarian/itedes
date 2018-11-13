#!/bin/bash

declare -i base=0
declare -i altura=0
declare -i area


while [[ $base -le 0 || $altura -le 0 ]]; do
	read -p "Ingrese base: " base
	read -p "Ingrese altura: " altura

done

	area=$base*$altura
	echo "El area del rectangulo es: " $area

exit 0
