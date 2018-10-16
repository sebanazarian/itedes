import java.util.Scanner;

public class Ejercicio4{
	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);


		System.out.print("Ingrese un numero: ");
		Integer number1 = Integer.parseInt(teclado.nextLine());

		System.out.print("Ingrese un numero: ");
		Integer number2 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Ingrese un numero: ");
		Integer number3 = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Ingrese un numero: ");
		Integer number4 = Integer.parseInt(teclado.nextLine());
	
		if(number1.equals(number2) || number3.equals(number4)){
			System.out.println("Son iguales");
		}	
	}
}
