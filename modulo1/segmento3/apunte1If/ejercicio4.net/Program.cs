using System;

namespace ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
			Console.WriteLine("Ingrese un numero");
			int number1 = int.Parse(Console.ReadLine());
			
			Console.WriteLine("Ingrese un numero");
			int number2 = int.Parse(Console.ReadLine());
			
			Console.WriteLine("Ingrese un numero");
			int number3 = int.Parse(Console.ReadLine());
			
			Console.WriteLine("Ingrese un numero");
			int number4 = int.Parse(Console.ReadLine());
			
			if (number1 == number2 || number3 == number4 )
			{
				Console.WriteLine("Son iguales");
			}
        }
    }
}
