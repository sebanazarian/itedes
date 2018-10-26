using System;

namespace ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese su Genero");
			string genero = Console.ReadLine();

			Console.WriteLine("Ingrese su edad");
			int edad = int.Parse(Console.ReadLine());

			if (genero.ToUpper()== "M" && edad >= 18)
			{
				Console.WriteLine("El usuario es Masculino y mayor de 18 años");
			}
        }
    }
}
