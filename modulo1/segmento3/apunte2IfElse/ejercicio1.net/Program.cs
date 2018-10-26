using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int number = int.Parse(Console.ReadLine());

			int result = number%2;

			if(result==0)
			{
				Console.WriteLine(number + " es multiplo de 2");
			}
        }
    }
}
