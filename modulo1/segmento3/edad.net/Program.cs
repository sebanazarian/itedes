using System;

namespace edad.net
{
    class Program
    {
        static void Main(string[] args)
        {
            
			Console.WriteLine("ingrese su edad: ");
			int edad = int.Parse(Console.ReadLine());
			
			if (edad >= 18)
			{
				Console.WriteLine("Usted es mayor de edad");
			}
        }
    }
}
