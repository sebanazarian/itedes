#!/bin/bash 

declare -p linea

for(( i=0; i<5;i++ )){
	for(( j=0; j<1;j++ )){
		linea+="x"
		echo "$linea"
	}
}
