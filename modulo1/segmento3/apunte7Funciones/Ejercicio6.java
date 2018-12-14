import java.util.Scanner;

public class Ejercicioi6{

	public static Integer potencia(Integer num, Integer potencia){

		Integer total=num;

		for(Integer i=1;i<potencia;i++){
			total*=num;
		}

		return total;
	
	
	}

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		String opcionMenu="1"

		while(opcionMenu<>"0"){
			System.out.println("1-Sumar ");
			System.out.println("2-Restar ");
			System.out.println("3-Multiplicar ");
			System.out.println("4-Division ");
			System.out.println("5-Potencia ");
			System.out.println("Ingrese la opcion deseada: ");		

			opcionMenu=teclado.nextLine();
		}	
	
	}

}
