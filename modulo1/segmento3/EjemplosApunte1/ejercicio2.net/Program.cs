using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            
			Console.WriteLine("ingrese su nombre: ");
			string nombre = Console.ReadLine();
			
			if (nombre == "Pedro")
			{
				Console.WriteLine("Hola" + nombre);
			}
        }
    }
}
