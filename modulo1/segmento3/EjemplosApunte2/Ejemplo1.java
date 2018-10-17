import java.util.Scanner;

public class Ejemplo1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese una opcion (1,2 o 3): ");

		Integer opcion = Integer.parseInt(teclado.nextLine());

		if(opcion==1){
			System.out.println("Eligio 1");
		}else if (opcion==2){
			System.out.println("Eligio 2");
		
		}else if(opcion==3){
			System.out.println("Eligio 3");
		}else{
			System.out.println("Opcion incorrecta");
		}
	
	}
}
