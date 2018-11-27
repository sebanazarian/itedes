function maximo(){
	if (( $1>=$2 ))
	then
		maximo=$1
	else
		maximo=$2
	fi
	
	if (( $3>$maximo ))
	then
		maximo=$3
	else
		maximo=$maximo
	fi
	echo $maximo
}

declare -i number=0
declare -i number2=0
declare -i number3=0

read -p "Ingrese un numero: " number
read -p "Ingrese un numero: " number2
read -p "Ingrese un numero: " number3

respuesta=$(maximo $number $number2 $number3)

echo ${respuesta}

exit 0
