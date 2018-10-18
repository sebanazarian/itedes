using System;

namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese su genero (M/F)");
			string genero = Console.ReadLine();

			if (genero.ToUpper() == "F")
			{
				Console.WriteLine("Es femenino");
			}else if(genero.ToUpper() == "M")
			{
				Console.WriteLine("Es masculino");
			}
        }
    }
}
