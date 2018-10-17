import java.util.Scanner;

public class Ejemplo2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		Integer number1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Ingrese otro numero");
		Integer number2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Ingrese la operacion a realizar (+,-,* o /): ");
		String operacion = teclado.nextLine();
		
		Integer resultado;
		if(operacion.equals("+")){
			resultado = number1 + number2;
			System.out.println("El resultado de la suma es "+ resultado);
		}else if(operacion.equals("-")){
			resultado = number1 - number2;
			System.out.println("El resultado de la resta es "+ resultado);
		
		}else if(operacion.equals("*")){
			resultado = number1 * number2;
			System.out.println("El resultado de la multiplicacion es "+ resultado);
		
		}else if(operacion.equals("/")){
			resultado = number1 / number2;
			System.out.println("El resultado de la division es "+ resultado);
		
		}

		
	
	}
}
