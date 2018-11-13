import java.util.Scanner;

public class Ejercicio1{
	
	public static Integer divisores(Integer num){
		Integer divisores=0;
		for(Integer i=1;i<=num;i++){
			if(num%i==0){
				divisores+= 1;	
			
			}
		
		}	
	
		return divisores;
	
	
	}

	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		Integer numero = Integer.parseInt(teclado.nextLine());

		Integer cantidad;

		cantidad = divisores(numero);
	
		System.out.println("Cantidad de divisores: "+ cantidad);
	}


}
