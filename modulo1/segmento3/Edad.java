import java.util.Scanner;

public class Edad{
	public static void main(String []args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cual es su edad: ");
		Integer edad = teclado.nextInt();

		if (edad >=18)
			System.out.println("Usted es mayor de edad ");
	
	}	

}
