using System;

namespace ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
            int num=1;
			int maximo=0;
			while(num!=0)
			{
				Console.WriteLine("Ingrese un numero: ");
				num=int.Parse(Console.ReadLine());
				if (num>=maximo)
				{
					maximo=num;
				}
			}
				Console.WriteLine("Maximo: " + maximo);
        }
    }
}
