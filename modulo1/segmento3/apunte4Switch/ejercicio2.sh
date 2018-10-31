#!/bin/bash


read -p "Ingrese un caracter: " carac

case $carac in
	[0-9]*)
		respuesta="numero"
		;;
	a)
		respuesta="vocal"
		;;
	e)
		respuesta="vocal"
		;;
	i)
		respuesta="vocal"
		;;
	o)
		respuesta="vocal"
		;;
	u)
		respuesta="vocal"
		;;
	b)
		respuesta="consonante"
		;
	
esac

	echo $respuesta
exit 0

