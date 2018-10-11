#!/bin/bash

read -p "Ingrese un número" number
if((number >= 0 && number <= 9))
then
	echo “Es dígito”
fi
exit 0 
