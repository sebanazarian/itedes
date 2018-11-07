using System;

namespace ejercicio6.net
{
    class Program
    {
        static void Main(string[] args)
        {
			int i;
			int j;
			int k;
			int maximo=0;
			string linea="";

			Console.WriteLine("Ingrese el maximo: ");
			maximo= int.Parse(Console.ReadLine());

			for(i=0;i<maximo;i++)
			{
				linea+="x";
				Console.WriteLine(linea);
			}

			for(j=i-1;j>0;j--)
			{
				linea="";
				for(k=0;k<j;k++)
				{
					linea+="x";
				}
				Console.WriteLine(linea);
			}
        }
    }
}
