
while [ seguir=="si" ]; do
	read -i "Ingrese un numero: " number1
	read -i "Ingrese un numero: " number2

	resultado=number1+number2
	echo $resultado
	read -p "Desea continuar: " seguir

done

exit 0
