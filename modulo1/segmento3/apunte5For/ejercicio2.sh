#!/bin/bash

declare -i resu
declare -i i
for (( i=0; i<10; i++ )){

	if [[ $i%2 == 0 ]]
	then
		echo " $i"
	fi
	echo " $i"
}

exit 0
