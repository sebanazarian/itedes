import java.util.Scanner;

public class Ejercicio4{

	public static Boolean par(Integer num){
		Boolean respuesta=true;

		if(num%2==0){
			respuesta=true;
		}else{
			respuesta=false;
		}
		
		return respuesta;
	
	
	}
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		Boolean respuesta;

		System.out.println("Ingrese un numero: ");
		Integer num= Integer.parseInt(teclado.nextLine());

		respuesta= par(num);

		if(respuesta){
			System.out.println("El numero es par");
		}else{
			System.out.println("El numero es impar");
		}
	
	}

}
