import java.util.Scanner;

public class Ejercicio3{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
	
		String opcion;

		System.out.println("Ingrese un caracter cualquiera : ");
		String caracter = teclado.nextLine();


		if(caracter.toUpperCase().equals("A") || caracter.toUpperCase().equals("E") || caracter.toUpperCase().equals("I") || caracter.toUpperCase().equals("O") || caracter.toUpperCase().equals("U")){
			opcion = "vocal";
		}else{
			opcion="consonante";
		}
		System.out.println(caracter.toString() + " es " + opcion );

	}	

}
