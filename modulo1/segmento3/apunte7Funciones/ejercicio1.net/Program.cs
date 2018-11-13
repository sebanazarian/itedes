using System;

namespace ejercicio1.net
{
    class Program
    {
		public static int divider(int num)
		{
			int quantity=0;

			for(int i =1;i<=num;i++)
			{
				if(num%i==0)
				{
					quantity+=1;
				}
			}
			return quantity;
		}

        static void Main(string[] args)
        {
            int quantyDivider;

			Console.WriteLine("Ingrese un numero: ");
			int number=int.Parse(Console.ReadLine());
			
			quantyDivider=divider(number);
			
			Console.WriteLine("Total de Divisores: " + quantyDivider);
        }
    }
}
