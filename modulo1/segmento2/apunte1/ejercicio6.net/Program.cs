using System;

namespace ejercicio6.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero");
			int num1 = int.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese un numero");
			int num2 = int.Parse(Console.ReadLine());

			int result = num1*num2;

			Console.WriteLine("El resultado es : "+ result);

        }
    }
}
