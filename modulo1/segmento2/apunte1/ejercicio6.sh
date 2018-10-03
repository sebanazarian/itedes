#!/bin/bash

declare -i number1=0
declare -i number2=0

read -p "ingrese un numero: " number1
read -p "ingrese un numero: " number2

declare -i result=$((number1 *  number2))

echo " El resultado de la multiplicacion es :" $result

exit 0
