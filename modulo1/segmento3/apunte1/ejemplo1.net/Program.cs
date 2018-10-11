using System;

namespace ejemplo1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese su edad: ");
			int edad = int.Parse(Console.ReadLine());

			if (edad >= 18)
			{
				Console.WriteLine("Usted es mayor ");
			}else
			{
				Console.WriteLine("Usted es menor ");
			}
		}
    }
}
