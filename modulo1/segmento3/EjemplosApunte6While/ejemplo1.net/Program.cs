using System;

namespace ejemplo1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            string seguir="SI";

			while(seguir=="SI")
			{
				Console.WriteLine("Seguir?");
				seguir=Console.ReadLine();

			}
        }
    }
}
