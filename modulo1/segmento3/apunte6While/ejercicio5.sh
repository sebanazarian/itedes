#!/bin/bash

declare -i num
declare -i maximo=0
while [[ $num != 0 ]];do
	read -p "Ingrese un numero: " num
	if [[ $num > $maximo ]]
	then
		maximo=$num
		echo $maximo
	fi
done

echo $maximo
exit 0
