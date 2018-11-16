using System;

namespace ejercicio3.net
{
    class Program
    {
        static void Main(string[] args)
        {
            int bas=0;
			int altura=0;
			int area=0;
			
			while(altura<=0 || bas<=0)
			{
				Console.WriteLine("Ingrese base: ");
				bas=int.Parse(Console.ReadLine());
			
				Console.WriteLine("Ingrese base: ");
				altura=int.Parse(Console.ReadLine());
			}
			area=bas*altura;
			Console.WriteLine(area);
        }
    }
}
