#!/bin/bash


read -p "Ingrese un caracter: " caracter 

if [[ "$caracter" == "a" || "$caracter"	== "b" || "$caracter" == "c" || "$caracter" == "o" || "$caracter" == "u" ]]
then
	opcion="vocal"
elif [["$caracter" == "1" ||"$caracter" == "2" || "$caracter" == "3" || "$caracter" == "4" || "$caracter" == "5" || "$caracter" == "6" || "$caracter" == "7" || "$caracter" == "8" || "$caracter" == "9" || "$caracter" == "0"   ]]
then
	opcion="numero"
fi
echo $opcion

exit 0
