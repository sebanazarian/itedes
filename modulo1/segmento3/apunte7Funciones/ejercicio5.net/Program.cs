using System;

namespace ejercicio4.net
{
    class Program
    {
		public static int cubo(int num)
		{
			int result=num;

			for(int i=0;i<=1;i++)
			{
				result*=num;
			}

			return result;
		}
        static void Main(string[] args)
        {
            int result;

			Console.WriteLine("Ingrese un numero");
			int num = int.Parse(Console.ReadLine());

			result= cubo(num);

			Console.WriteLine(result);
        }
    }
}
