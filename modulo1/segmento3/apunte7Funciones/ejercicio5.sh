#!/bin/bash
function cubo(){
	declare -i powBase=$1
	declare -i result=powBase
	for((i=1;i<=2;i++ )){
		result=$((result*powBase))
	}
	echo $result
}

declare -i number=0

read -p "Ingrese un numero: " number

respuesta=$(cubo $number)

echo "$respuesta"

exit 0
