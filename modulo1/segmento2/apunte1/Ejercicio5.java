import java.util.Scanner;

public class Ejercicio5{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		Integer num1;
		Integer num2;
		Integer result;

		System.out.println("Ingrese un numero: ");
		num1= teclado.nextInt();
		System.out.println("Ingrese un numero: ");
		num2= teclado.nextInt();
		
		result= num1 - num2;

		System.out.println("El resultado es: " + result);


	}

}
