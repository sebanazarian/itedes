using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            int total=0;
			string seguir="s";
			
			while(seguir.ToUpper() =="S")
			{
				Console.WriteLine("Ingrese un numero: ");
				int num1=int.Parse(Console.ReadLine());
		
				Console.WriteLine("Ingrese un numero: ");
				int num2=int.Parse(Console.ReadLine());
				
				total=num1+num2;
				Console.WriteLine("Total :" + total);
		
				Console.WriteLine("Desea continuar(s/n)");
				seguir=Console.ReadLine();
			}
        }
    }
}
