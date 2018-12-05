using System;

namespace ejercicio4.net
{
    class Program
    {
		public static bool par(int num)
		{
			bool respuesta;

			if(num%2==0)
			{
				respuesta=true;
			}
			else
			{
				respuesta=false;
			}

			return respuesta;
		}
        static void Main(string[] args)
        {
            bool respuesta;

			Console.WriteLine("Ingrese un numero");
			int num = int.Parse(Console.ReadLine());

			respuesta= par(num);

			if(respuesta)
			{
				Console.WriteLine("El numero es par ");
			}
			else
			{
				Console.WriteLine("El numero es impar ");
			}
        }
    }
}
