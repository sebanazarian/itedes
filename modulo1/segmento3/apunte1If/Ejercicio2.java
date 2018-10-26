import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("ingrese un numero: ");

		Integer numero = Integer.parseInt(teclado.nextLine());

		if(numero!=10){
			System.out.println("El numero no es 10");
		}
	}
}
