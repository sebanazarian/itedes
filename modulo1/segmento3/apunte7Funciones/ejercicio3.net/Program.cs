using System;

namespace ejercicio3.net
{
    class Program
    {
		public static int maximo(int num1,int num2,int num3)
		{	
			int max = 0;
			if (num1>=num2)
			{
				max=num1;
			}
			else
			{
				max=num2;
			}

			if (num3>=max)
			{
				max=num3;
			}

			return max;
		}

        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int num1= int.Parse(Console.ReadLine());
        
            Console.WriteLine("Ingrese un numero: ");
			int num2= int.Parse(Console.ReadLine());
        
			Console.WriteLine("Ingrese un numero: ");
			int num3= int.Parse(Console.ReadLine());

			int respuesta = maximo(num1,num2,num3);
			
			Console.WriteLine("Maximo: " + respuesta);
        }
    }
}
