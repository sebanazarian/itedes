import java.util.Scanner;

public class Ejercicio4{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		Double num=1.0;
		Double total=0.0;

		while(num!=0){
			System.out.println("Ingrese un numero");
			num=Double.parseDouble(teclado.nextLine());

			total+=num;
			
			System.out.println("Total: "+ total);
		
		
		
		}
	
	
	}


}
