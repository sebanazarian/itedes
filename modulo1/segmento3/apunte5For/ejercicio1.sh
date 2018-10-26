#!/bin/bash
read -p "Ingrese un numero: " number


for (( i=0; i<11; i++ )){
	declare -i resultado=$number*$i
	echo $number"x" $i "= "$resultado
}
exit 0
