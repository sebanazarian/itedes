import java.util.Scanner;

public class Delta {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Vertice: ");
		Integer vertice = Integer.parseInt(teclado.nextLine());

		for(Integer i = 1; i <= vertice; i++) {
			String linea = "";

			for(Integer k = 1; k <= i; k++)
				linea += "x";

			System.out.println(linea);
		}
	}
}
