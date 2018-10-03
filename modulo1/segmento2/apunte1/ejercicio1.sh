#!/bin/bash

declare barrio=""
declare direccion=""
declare entrecalle1=""
declare entrecalle2=""

read -p "Ingrese el nombre de su barrio:" barrio
read -p "Ingrese la direccion de la comisaria mas cercana:" direccion
read -p "Ingrese las entrecalles:" entrecalle1
read -p "Ingrese las entrecalles:" entrecalle2

echo "La comisaria de $barrio se encuentra en la calle $direccion entre $entrecalle1 y $entrecalle2"
exit 0
