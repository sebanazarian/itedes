#!/bin/bash

declare dni=""
declare nombre=""
declare apellido=""
declare direccion=""
declare telefon=""

read -p "Ingrese su DNI: " dni
read -p "Ingrese su nombre: " nombre
read -p "Ingrese su apellido: " apellido
read -p "Ingrese su direccion: " direccion
read -p "Ingrese su telefono: " telefono

echo "DNI: $dni"
echo "Nombre: $nombre"
echo "Apellido: $apellido "
echo "Direccion: $direccion"
echo "Telefono: $telefono "

exit 0
