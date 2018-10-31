import java.util.Scanner;

public class Ejercicio4{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero romano: ");
		String number = teclado.nextLine();
		
		String respuesta = "";

		if (number.toUpperCase().equals("I")){
			respuesta = "1";
		}else if (number.toUpperCase().equals("V")){
			respuesta = "5";
		}else if (number.toUpperCase().equals("X")){
			respuesta = "10";
		}else if (number.toUpperCase().equals("L")){
			respuesta = "50";
		}else if (number.toUpperCase().equals("C")){
			respuesta = "100";
		}else{
			respuesta = "Numero romano no valido";
		}

		System.out.println(respuesta);
	
	}

}
