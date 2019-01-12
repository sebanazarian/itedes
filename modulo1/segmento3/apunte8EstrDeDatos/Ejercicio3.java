import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();

		for(Integer i=0;i<5;i++){
			System.out.print("Ingrese un numero: ");
			Integer numero = Integer.parseInt(teclado.nextLine());
			lista.add(numero);
		}

		System.out.print(lista);
		ArrayList<Integer> lista2 = new ArrayList<Integer>();

		for(Integer i=0;i<5;i++){
			lista2.add(lista.get(i)*2);
			
		}
		System.out.println(lista2);

	}
}
