﻿using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese su usuario: ");
			string user = Console.ReadLine();

			Console.WriteLine("Ingrese su contrasena: ");
			string pass = Console.ReadLine();

			if ((user == "Juan" && pass == "1234") || (user =="Pedro" && pass == "5678"))
			{
				Console.WriteLine("Bienvenido " + user);
			}else
			{
				Console.WriteLine("usuario y/o contrasena incorrecto");
			}

        }
    }
}
