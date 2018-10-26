import java.util.Scanner;

public class Ejercicio1{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		Integer numero = Integer.parseInt(teclado.nextLine());

		for (Integer i=0; i<=11; i++){
			Integer resultado = numero*i;
			System.out.println(numero + "x"+ i+"=" + resultado);
		
		}
	
	}

}
