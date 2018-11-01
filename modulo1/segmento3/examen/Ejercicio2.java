import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese numero de inicio: ");
		Integer numini = Integer.parseInt(teclado.nextLine());
	
		System.out.println("Ingrese numero de fin: ");
		Integer numfin = Integer.parseInt(teclado.nextLine());
	
		System.out.println("Ingrese numero de referencia: ");
		Integer numref = Integer.parseInt(teclado.nextLine());
		
		Integer resultado=0;

		if (numfin>numini){
			if(numfin>0 && numini>0 && numref>0){
				for ( Integer i=numini; i<=numfin; i++){
					resultado=i%numref;
					if(resultado==0){
						System.out.println(i);
					}				
				}
			}else{
				System.out.println("Los numeros ingresados deben ser mayor a 0");

			}
		}else{
			System.out.println("El numero de fin debe ser mayor que el numero de inicio");
			
		}	
	}


}
