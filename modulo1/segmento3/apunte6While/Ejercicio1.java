import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		Integer a=3;

		do{
			System.out.print("Ingrese a: ");
			a=Integer.parseInt(teclado.nextLine());
		
		}while(a<=100);
	
	}

}
