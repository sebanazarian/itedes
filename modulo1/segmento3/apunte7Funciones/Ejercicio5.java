import java.util.Scanner;

public class Ejercicio5{

	public static Integer cubo(Integer num){
		Integer total=num;

		for(Integer i=0;i<=1;i++){
			total*=num;
		}

		return total;
	
	
	}
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		Integer total;

		System.out.println("Ingrese un numero: ");
		Integer num= Integer.parseInt(teclado.nextLine());

		total= cubo(num);

		System.out.println("El total es: "+ total );
	
	}

}
