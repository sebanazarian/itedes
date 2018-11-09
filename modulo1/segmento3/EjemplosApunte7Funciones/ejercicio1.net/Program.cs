using System;

namespace ejercicio1.net
{
    class Program
    {
		public static int potenciar(int bas,int exponente)
		{
			int resultado = bas;

			for(int i=1;i<=exponente; i++)
			{
				resultado=resultado*bas;
			}

			return resultado;
		
		}

        static void Main(string[] args)
        {
            Console.WriteLine("Base: ");
			int bas = int.Parse(Console.ReadLine());
        
            Console.WriteLine("Exponente: ");
			int exponente = int.Parse(Console.ReadLine());

			int resultado = potenciar(bas,exponente);

			Console.WriteLine(resultado);
        }
    }
}
