using System;


namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
           
		   	Console.Write("Ingrese su barrio: ");
		   	string barrio = Console.ReadLine();

		   	Console.Write("Ingrese la direccion de la comisaria mas cercana: ");
		   	string direccion = Console.ReadLine();

			Console.Write("Ingrese la entrecalle1: ");
		   	string entrecalle1 = Console.ReadLine();
		   
		   	Console.Write("Ingrese la entrecalle2: ");
		   	string entrecalle2 = Console.ReadLine();

						
		   //Int32.Parse	 

		   	Console.WriteLine("La comisaria de" + barrio + "queda en " + direccion + " entre las calles " + entrecalle1 + " y " + entrecalle2);
        }
    }
}
