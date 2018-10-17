import java.util.Scanner;

public class Ejercicio2{
	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cual es su nombre: ");
		String name = teclado.nextLine();

		if (name.equals("Pedro"))
			System.out.println("Hola " + name);
	
	}	

}
