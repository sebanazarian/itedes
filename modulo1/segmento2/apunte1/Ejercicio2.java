import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);
		

		System.out.println("Ingrese los siguientes datos");

		String dni;
		System.out.println("Ingrese su DNI: ");
		dni = teclado.nextLine();

		String name;
		System.out.println("Ingrese su nombre: ");
		name = teclado.nextLine();

		String surname;
		System.out.println("Ingrese su Apellido: ");
		surname = teclado.nextLine();

		String adress;
		System.out.println("Ingrese su Direccion: ");
		adress= teclado.nextLine();

		String telephone;
		System.out.println("Ingrese su tefono: ");
		telephone= teclado.nextLine();

		System.out.println("Sus datos son:");
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + name);
		System.out.println("Apellido: " + surname);
		System.out.println("Direccion: "+ adress);
		System.out.println("Telefono: " + telephone);
		
		
		
	}
}
