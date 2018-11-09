using System;

namespace ejemplo2.net
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Ingrese un numero");
			int num = int.Parse(Console.ReadLine());
			while(num<=100){
			
            	Console.WriteLine("Ingrese un numero");
				num = int.Parse(Console.ReadLine());
				
			}
        }
    }
}
