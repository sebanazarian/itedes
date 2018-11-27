function multiplos(){
	if (( $1%$2==0 ))
	then
		respuesta="$1 es multiplo de  $2"
	elif(( $2%$1==0 ))
	then
		respuesta="$2 es multiplo de  $1"
	else
		respuesta="No son multiplos"
	fi
	echo $respuesta
}

declare -i number=0
declare -i number2=0

read -p "Ingrese un numero: " number
read -p "Ingrese un numero: " number2

respuesta=$(multiplos $number $number2)

echo ${respuesta}

exit 0
