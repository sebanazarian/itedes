#!/bin/bash

declare -i num
declare -i maximo=0
while [[ $num != 0 ]];do
	read -p "Ingrese un numero: " num
	if [[ $num -gt $maximo ]]
	then
		maximo=$num
		echo "max" $maximo
		echo "num" $num
	fi
done

echo $maximo
exit 0
