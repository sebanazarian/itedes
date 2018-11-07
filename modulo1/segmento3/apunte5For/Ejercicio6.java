import java.util.Scanner;

public class Ejercicio6{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el maximo");
		Integer max= Integer.parseInt(teclado.nextLine());

		String linea= "";

		for (Integer i=0;i<max; i++){
			linea+= "x";
			System.out.println(linea);
		}

		for (Integer i=max-1;i>0;i--){
			linea="";
			for(Integer j=0;j<i;j++){
				linea+="x";
			}
			System.out.println(linea);
		
		}
	
	
	}


}
