#!/bin/bash

declare -x esnumero='^[0-9]+$'

read -p "Ingrese un caracter: " caracter 

if [ "$caracter" == "a" || "$caracter"	== "b" || "$caracter" == "c" || "$caracter" == "o" || "$caracter" == "u"]
then
	opcion= "vocal"
	
elif [ "$caracter" =~ "$es_numero" ]
then        
	opcion= "numero"
else
	opcion= "consonante"
fi

echo $opcion

exit 0
