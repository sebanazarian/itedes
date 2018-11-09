import java.util.Scanner;

public class Ejercicio1{
	
	public static Integer potenciar(Integer base, Integer exponente){
	
		Integer resultado = base;

		for ( int i=1;i<exponente;i++){
			resultado = resultado*base;
		}

		return resultado;
	
	
	}
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
	
		System.out.print("Base: ");
		Integer base= Integer.parseInt(teclado.nextLine());

		System.out.print("Exponente: ");
		Integer exponente= Integer.parseInt(teclado.nextLine());

		Integer resultado;

		resultado = potenciar(base, exponente);

		System.out.println(resultado);
	}

}
