import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("ingrese un numero: ");

		Integer numero = Integer.parseInt(teclado.nextLine());

		if(numero==10){
			System.out.println("El numero es 10");
		}
	}
}
