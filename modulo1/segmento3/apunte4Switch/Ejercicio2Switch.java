import java.util.Scanner;

public class Ejercicio2Switch {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un caracter: ");
		String caracter = teclado.nextLine();
		String respuesta;

		switch(caracter.toUpperCase()){
			case "1":
				respuesta ="numero";
				break;
			case "2":
				respuesta ="numero";
				break;
			case "3":
				respuesta ="numero";
				break;
			case "4":
				respuesta ="numero";
				break;
			case "5":
				respuesta ="numero";
				break;
			case "6":
				respuesta ="numero";
				break;
			case "7":
				respuesta ="numero";
				break;
			case "8":
				respuesta ="numero";
				break;
			case "9":
				respuesta ="numero";
				break;
			case "0":
				respuesta ="numero";
				break;
			case "A":
				respuesta ="Vocal";
				break;
			case "E":
				respuesta ="Vocal";
				break;
			case "I":
				respuesta ="Vocal";
				break;
			case "O":
				respuesta ="Vocal";
				break;
			case "U":
				respuesta ="Vocal";
				break;
			case "B":
				respuesta ="Consonante";
				break;
			case "C":
				respuesta ="Consonante";
				break;
			case "D":
				respuesta ="Consonante";
				break;
			case "F":
				respuesta ="Consonante";
				break;
			case "G":
				respuesta ="Consonante";
				break;
			case "H":
				respuesta ="Consonante";
				break;
			case "J":
				respuesta ="Consonante";
				break;
			case "K":
				respuesta ="Consonante";
				break;
			case "L":
				respuesta ="Consonante";
				break;
			case "M":
				respuesta ="Consonante";
				break;
			case "N":
				respuesta ="Consonante";
				break;
			case "P":
				respuesta ="Consonante";
				break;
			case "Q":
				respuesta ="Consonante";
				break;
			case "R":
				respuesta ="Consonante";
				break;
			case "S":
				respuesta ="Consonante";
				break;
			case "T":
				respuesta ="Consonante";
				break;
			case "V":
				respuesta ="Consonante";
				break;
			case "W":
				respuesta ="Consonante";
				break;
			case "X":
				respuesta ="Consonante";
				break;
			case "Y":
				respuesta ="Consonante";
				break;
			case "Z":
				respuesta ="Consonante";
				break;
			default:
				respuesta ="Error";
				break;
		}

		System.out.println(respuesta);

	}
}
