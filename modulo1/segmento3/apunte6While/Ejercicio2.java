import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		Integer number1;
		Integer number2;
		Integer total= 0;
		String  seguir="S";

		while(seguir=="S"){
			System.out.println("Ingrese un numero: ");
			number1=Integer.parseInt(teclado.nextLine());
			System.out.println("Ingrese un numero: ");
			number2=Integer.parseInt(teclado.nextLine());

			total = number1+number2;

			System.out.println("Total: " + total);

			System.out.println("Desea continuar(s/n)");
			seguir=teclado.nextLine().toUpperCase();
			System.out.println(seguir);	
		}
	
	}

}
