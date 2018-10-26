import java.util.Scanner;

public class Ejemplo2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		String genero;
		System.out.println("Ingrese su genero (M/F): ");
		genero = teclado.nextLine();

		if(genero.toUpperCase().equals("M")){
			System.out.println("Es Varon");
		} else{
			System.out.println("Es mujer");	
		}
		

	}

}
