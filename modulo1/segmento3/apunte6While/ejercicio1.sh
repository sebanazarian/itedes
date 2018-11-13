#!/bin/bash

read -p "Ingrese un numero: " number
while [ $number -le 100 ]; do
	read -p "Ingrese un numero: " number
done

exit 0
