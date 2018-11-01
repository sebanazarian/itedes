import java.util.Scanner;

public class Ejercicio3Switch {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un numero romano: ");
		String number = teclado.nextLine();
		String respuesta;

		switch(number.toUpperCase()){
			case "I":
				respuesta ="1";
				break;
			case "V":
				respuesta ="5";
				break;
			case "X":
				respuesta ="10";
				break;
			case "L":
				respuesta ="50";
				break;
			case "C":
				respuesta ="100";
				break;
			case "D":
				respuesta ="500";
				break;
			case "M":
				respuesta ="1000";
				break;
			default:
				respuesta ="Error: Numero romano invalido";
				break;
		}

		System.out.println(respuesta);

	}
}
