import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		String barrio;
		System.out.print("Ingrese su barrio: ");
		barrio = teclado.nextLine();
		
		String direccion;
		System.out.print("Ingrese la direccion de la comisaria mas cercana: ");
		direccion= teclado.nextLine();

		String entrecalle1;
		System.out.print("Entrecalle1: ");
		entrecalle1= teclado.nextLine();

		String entrecalle2;
		System.out.print("Entrecalle2: ");
		entrecalle2= teclado.nextLine();

		System.out.println("La comisaria de " + barrio + " se encuentra en " + direccion + " entre las calles " + entrecalle1 + " y " + entrecalle2);

	}
}
