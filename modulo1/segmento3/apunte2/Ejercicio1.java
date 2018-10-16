import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		Integer number = Integer.parseInt(teclado.nextLine());

		Integer resto = number%2;

		if(resto != 0){
			System.out.println(number.toString() + " no es multiplo de 2");
		}else{
			System.out.println(number.toString() + " es multiplo de 2");

			
		}
	
	}

}
