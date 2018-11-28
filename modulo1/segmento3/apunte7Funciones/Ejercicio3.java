import java.util.Scanner;

public class Ejercicio3{
	public static String multiplos(Integer num1,Integer num2){
		String respuesta="";
		if(num1%num2==0){
			respuesta=num1 + " es multiplo de " + num2;
		}else if(num2%num1==0){
			respuesta=num2 + " es multiplo de " + num1;
		}else{
			respuesta= "No son multiplos";
		
		}
		return respuesta;
	}
	
	public static void main(String args[]){
		Scanner teclado= new Scanner(System.in);
		String respuesta="";

		System.out.println("Ingrese un numero: ");
		Integer num1= Integer.parseInt(teclado.nextLine());

		System.out.println("Ingrese un numero: ");
		Integer num2= Integer.parseInt(teclado.nextLine());

		respuesta= multiplos(num1,num2);
		System.out.println(respuesta);
	}
}
