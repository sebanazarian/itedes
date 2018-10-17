#!/bin/bash

read -p "Ingrese un numero: " number

declare -i result=$number%2

if [ "$result" == 0 ]
then
	echo  $number  " es multiplo de 2"
fi
exit 0
