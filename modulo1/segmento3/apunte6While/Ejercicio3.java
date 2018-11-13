import java.util.Scanner;

public class Ejercicio3{
	public static void main (String args[]){
		Scanner teclado = new Scanner(System.in);
		
		Integer base=0;
		Integer altura=0;
		Integer area=0;
		
		while(base<=0 || altura<=0){

			System.out.println("Ingrese base: ");
			base= Integer.parseInt(teclado.nextLine());
			
			System.out.println("Ingrese base: ");
			altura= Integer.parseInt(teclado.nextLine());
			
		}
		
		area=base*altura;
		System.out.println("El area es : "+ area);
	
	
	
	}


}
