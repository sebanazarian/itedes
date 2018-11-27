using System;

namespace ejercicio2.net
{
    class Program
    {
		public static string multiplos(int num, int num2){
			string respuesta= "";

			if(num%num2==0)
			{
				respuesta=num + " es multiplo de " + num2;
			}
			else if(num2%num==0)
			{
				respuesta=num2 + " es multiplo de " + num;
			}
			else
			{
				respuesta="No son multiplos";
			}
			return respuesta;
		}

        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int num = int.Parse(Console.ReadLine());
        
            Console.WriteLine("Ingrese un numero: ");
			int num2 = int.Parse(Console.ReadLine());

			Console.WriteLine(multiplos(num,num2));
        }
    }
}
