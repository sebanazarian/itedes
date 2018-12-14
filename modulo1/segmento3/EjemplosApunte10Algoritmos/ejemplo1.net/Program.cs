using System;
using System.Collections.Generic;

namespace ejemplo1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> vector = new List<int>();
            Console.WriteLine("Hello World!");
             // Crear objeto. Utiliza el reloj del sistema para crear una semilla.
            Random rnd = new Random();

            for(int i=0;i<100;i++)
            {
                int numeroSinCotaArbitraria = rnd.Next(1,100);    
                vector.Add(numeroSinCotaArbitraria);
            }

            for(int i=0;i<vector.Count;i++)
            {
                for(int k=i+1;k<vector.Count;k++)
                {
                    if(vector[i]>vector[k])
                    {
                        int auxiliar= args;
                        vector.SetRange(k,vector.(i));
                        vector.Insert(i,auxiliar);         
                    }
                    
                }
            }
            Example(vector);

        }
        static void Example(ArrayList list)
        {
            foreach (int i in list)
            {
                Console.WriteLine(i);
            
            }
        }
    }
}
