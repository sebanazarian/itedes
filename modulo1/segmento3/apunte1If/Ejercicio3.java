import java.util.Scanner;

public class Ejercicio3{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese su genero (M/F): ");

		String genero = teclado.nextLine();

		if(genero.toUpperCase().equals("M")){
			System.out.println("Es varon");
		}else if (genero.toUpperCase().equals("F")){
			System.out.println("Es mujer");
		}
	}
}
