import java.util.Scanner;

public class Ejercicio5{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		Double num=1.0;
		Double maximo=0.0;

		while(num!=0){
			System.out.println("Ingrese un numero");
			num=Double.parseDouble(teclado.nextLine());

			if(num>=maximo){
				maximo=num;
			}
		}
			System.out.println("Maximo: "+ maximo);
	
	
	}


}
