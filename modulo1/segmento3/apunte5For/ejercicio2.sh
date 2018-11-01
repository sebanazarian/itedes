#!/bin/bash

declare -i resu
declare -i i
for (( i=100; i>0; i-- )){
	resu=$i%2
	if [[ $resu == 0 ]]
	then
		echo " $i"
	fi
}

exit 0
