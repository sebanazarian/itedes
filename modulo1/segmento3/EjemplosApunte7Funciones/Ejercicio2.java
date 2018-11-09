public class Ejercicio2{
	public static void main(String args[]){
	
		long resultado = 0;

		for(long i = 0; i < 100000000; i++)
			resultado = resultado+i;

		System.out.println(resultado);
	}
}
