﻿using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero");

			int numero = int.Parse(Console.ReadLine());

			if (numero == 10)
			{
				Console.WriteLine("El numero es 10");
			}
        }
    }
}
