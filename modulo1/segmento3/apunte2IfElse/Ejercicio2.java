import java.util.Scanner;

public class Ejercicio2{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese su usuario: ");
		String usuario = teclado.nextLine();

		System.out.print("Ingrese su contrasena: ");
		String contrasena = teclado.nextLine();

		if ((usuario.equals("Juan") && contrasena.equals("1234")) || (usuario.equals("Pedro") && contrasena.equals("5678"))){
			System.out.println("Bienvenido " + usuario);
		
		}else{
			System.out.println("Usuario y/o contrasena incorrecta");
		}

	}
}
