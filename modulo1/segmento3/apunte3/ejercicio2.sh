#!/bin/bash

read -p "Ingrese un dia (1-Lunes,2-Martes,3-Miercoles,4-Jueves,5-Viernes,6-Sabado,7-Domingo): " dia

declare respuesta=""

if ["$dia" == "1"]
then
	respuesta = "Lunes"
elif ["$dia" == "2"]
then
	respuesta ="Martes"
elif ["$dia" == "3"]
then
	respuesta ="Miercoles"
elif ["$dia" == "4"]
then
	respuesta ="Jueves"
elif ["$dia" == "5"]
then
	respuesta ="Viernes"
elif ["$dia" == "6"]
then
	respuesta ="Sabado"
elif ["$dia" == "7"]
then
	respuesta ="Domingo"
else
	respuesta ="Error"
fi
	echo "El dia es " + $dia
exit 0

