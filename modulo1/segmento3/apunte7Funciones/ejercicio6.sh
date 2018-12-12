#!/bin/bash

function sumar(){
	declare -i total
	declare -i num1=$1
	declare -i num2=$2
	total=$num1+$num2
	echo $total
}
function restar(){
	declare -i total
	declare -i num1=$1
	declare -i num2=$2
	total=$num1-$num2
	echo $total
}
function multiplicar(){
	declare -i total
	declare -i num1=$1
	declare -i num2=$2
	total=$num1*$num2
	echo $total
}
function dividir(){
	declare -i total
	declare -i num1=$1
	declare -i num2=$2
	total=$num1/$num2
	echo $total
}

function potencia(){
	declare -i powBase=$1
	declare -i powPotencia=$2
	declare -i result=powBase
	for((i=1;i<$powPotencia;i++ )){
		result=$((result*powBase))
	}
	echo $result
}

#main
declare -i number
declare -i number2

while [[ $opcionMenu != "0" ]];do
	echo "1-Sumar"
	echo "2-Restar"
	echo "3-Dividir"
	echo "4-Multiplicar"
	echo "5-Potencia"
	read -p "Ingrese la opcion deseada: " opcionMenu
	
	case $opcionMenu in
	1)
		clear
		read -p "Ingrese un numero: " number
		read -p "Ingrese otro numero: " number2
		result=$(sumar $number $number2)
		echo "El resultado de la suma es $result"
		;;
	2)
		clear
		read -p "Ingrese un numero: " number
		read -p "Ingrese un numero: " number2
		result=$(restar $number $number2)
		echo "El resultado de la resta es $result"
		;;
	3)
		clear
		read -p "Ingrese un numero: " number
		read -p "Ingrese un numero: " number2
		result=$(dividir $number $number2)
		echo "El resultado de la division es $result"
		;;
	4)
		clear
		read -p "Ingrese un numero: " number
		read -p "Ingrese un numero: " number2
		result=$(multiplicar $number $number2)
		echo "El resultado de la multiplicacion es $result"
		;;
	5)
		clear
		read -p "Ingrese un numero: " number
		read -p "Ingrese su exponente: " number2
		result=$(potencia $number $number2)
		echo "El resultado de la potencia es $result"
		;;
	*)
		clear
		;;
	esac
done

exit 0
