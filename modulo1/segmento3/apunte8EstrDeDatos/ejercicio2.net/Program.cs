using System;
using System.Collections.Generic;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> listaImpar = new List<int>();

            for(int i=0;i<=100;i++)
            {
                if(i%2!=0)
                {
                    listaImpar.Add(i);
                }
            }

            foreach(int nombre in listaImpar)
            {
                Console.WriteLine(nombre);
            }
        }
    }
}
