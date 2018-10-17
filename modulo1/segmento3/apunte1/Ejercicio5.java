import java.util.Scanner;

public class Ejercicio5{
	public static void main(String args[]){
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Ingrese su genero");
		String genero = teclado.nextLine();

		System.out.println("Ingrese su edad");
		Integer edad = Integer.parseInt(teclado.nextLine());

			if (genero.toUpperCase().equals("M") && edad >= 18){
				System.out.println("El usuario es masculino y mayor de 18 años");
			}
	}


}
