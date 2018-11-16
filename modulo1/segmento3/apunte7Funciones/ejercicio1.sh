function divisores(){
	declare -i cantDivisores=0
	for ((i=1; i<=$1; i++)){
		if (( $1%i==0 ))
		then
			cantDivisores+=1
		fi
	}
	echo $cantDivisores
}

declare -i number=0
declare -i cant=0

read -p "Ingrese un numero: " number
cant=$(divisores $number)

echo "Cantidad de divisores:" ${cant}

exit 0
