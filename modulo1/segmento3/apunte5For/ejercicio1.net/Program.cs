using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrse un numero: ");
			int number = int.Parse(Console.ReadLine());

			int resultado;

			for(int i = 0; i<=10; i++)
			{
				resultado=number*i;
				Console.WriteLine(number+"x"+i+"= " + resultado);
			}

        }
    }
}
