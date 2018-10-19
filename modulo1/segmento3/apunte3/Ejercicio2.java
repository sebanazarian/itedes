import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un dia (1-Lunes,2-Martes,3-Miercoles, 4-Jueves, 5-Viernes, 6-Sabado, 7-Viernes): ");
		Integer dia = Integer.parseInt(teclado.nextLine());
		String respuesta;

		if(dia== 1){
			respuesta="Lunes";
		}else if(dia==2){
			respuesta="Martes";
		}else if(dia==3){
			respuesta="Miercoles";
		}else if(dia==4){
			respuesta="Jueves";
		}else if(dia==5){
			respuesta="Viernes";
		}else if(dia==6){
			respuesta="Sabado";
		}else if(dia==7){
			respuesta="Domingo";
		}else{
			respuesta="Error";
		}

		System.out.println("El dia elegido es " + respuesta);

	}
}
