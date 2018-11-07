using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            int resu;
			int i;

			for(i=100;i>0;i--)
			{
				resu=i%2;
				if(resu==0)
				{
					Console.WriteLine(i);
				}
			}
        }
    }
}
