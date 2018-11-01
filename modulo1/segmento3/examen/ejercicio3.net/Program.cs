using System;

namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
			string seguir = "si";
			int number;
			double resultado;

			while (seguir.ToUpper()=="SI")
			{
            	Console.WriteLine("Ingrese un numero: ");
				number=int.Parse(Console.ReadLine());
			
				resultado = Math.Pow(number, 3) ;

				Console.WriteLine(resultado);
				Console.WriteLine("Desea realizar otra operacion?, si desea realizar otra operacion ingrese SI ");
				seguir =Console.ReadLine();
			
			}
        }
    }
}
