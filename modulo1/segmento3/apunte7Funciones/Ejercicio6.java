import java.util.Scanner;

public class Ejercicio6{

	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  
	public static Integer potencia(Integer num, Integer potencia){

		Integer total=num;

		for(Integer i=1;i<potencia;i++){
			total*=num;
		}

		return total;
	
	
	}

	public static Integer sumar(Integer number1, Integer number2){
		Integer total;

		total = number1+number2;

		return total;
	}

	public static Integer restar(Integer number1, Integer number2){
		Integer total;

		total = number1-number2;

		return total;
	}
	public static Integer multiplicar(Integer number1, Integer number2){
		Integer total;

		total = number1*number2;

		return total;
	}
	
	public static Integer division(Integer number1, Integer number2){
		Integer total;

		total = number1/number2;

		return total;
	}


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		Integer number1,number2;
		Integer total;
		String opcionMenu="1";

		while(!opcionMenu.equals("0")){
			System.out.println("1-Sumar ");
			System.out.println("2-Restar ");
			System.out.println("3-Multiplicar ");
			System.out.println("4-Division ");
			System.out.println("5-Potencia ");
			System.out.println("0-Salir ");
			System.out.println("Ingrese la opcion deseada: ");		

			opcionMenu=teclado.nextLine();

			switch(opcionMenu){
				case "1":
					clearScreen();
					System.out.print("Ingrese un numero: ");
					number1 = Integer.parseInt(teclado.nextLine());
					System.out.print("Ingrese un numero: ");
					number2 = Integer.parseInt(teclado.nextLine());
					total=sumar(number1,number2);
					System.out.println("El total de la suma es: "+ total);
					break;
				case "2":
					clearScreen();
					System.out.print("Ingrese un numero: ");
					number1 = Integer.parseInt(teclado.nextLine());
					System.out.print("Ingrese un numero: ");
					number2 = Integer.parseInt(teclado.nextLine());
					total=restar(number1,number2);
					System.out.println("El total de la resta es: "+ total);
					break;
				case "3":
					clearScreen();
					System.out.print("Ingrese un numero: ");
					number1 = Integer.parseInt(teclado.nextLine());
					System.out.print("Ingrese un numero: ");
					number2 = Integer.parseInt(teclado.nextLine());
					total=multiplicar(number1,number2);
					System.out.println("El total de la multiplicacion es: "+ total);
					break;
				case "4":
					clearScreen();
					System.out.print("Ingrese un numero: ");
					number1 = Integer.parseInt(teclado.nextLine());
					System.out.print("Ingrese un numero: ");
					number2 = Integer.parseInt(teclado.nextLine());
					total=division(number1,number2);
					System.out.println("El total de la division es: "+ total);
					break;	
				case "5":
					clearScreen();
					System.out.print("Ingrese un numero: ");
					number1 = Integer.parseInt(teclado.nextLine());
					System.out.print("Ingrese un numero: ");
					number2 = Integer.parseInt(teclado.nextLine());
					total=potencia(number1,number2);
					System.out.println("El total es: "+ total);
					break;		
				default:
					clearScreen();
					System.out.println("Ingrese una opcion correcta ");
					break;	
			}
		}	
	
	}

}
