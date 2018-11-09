using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            long resu=0;
			long i;

			for(i=0;i<100000000;i++)
			{
				resu=resu + i;
			}

			Console.WriteLine(resu);
        }
    }
}
