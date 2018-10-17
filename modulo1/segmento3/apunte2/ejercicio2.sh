
read -p "Ingrese su usuario: " user
read -p "Ingrese su contrasena: " pass
 
if  [[ ("$user" == "Juan"  &&  "$pass" == "1234" )   ||  ("$user" == "Pedro"  && "$pass" == "5678") ]] 
then
	echo "Bienvenido " $user
else
	echo "usaurio y/o contrasena incorrecto"
	
fi
exit 0

