using System;

namespace ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
            int num=1;
			int total=0;
			while(num!=0)
			{
				Console.WriteLine("Ingrese un numero: ");
				num=int.Parse(Console.ReadLine());
				
				total+=num;
				Console.WriteLine("Total: " + total);
			}
        }
    }
}
