using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
           Console.WriteLine("Ingrese su DNI");
		   string dni = Console.ReadLine();
			
           Console.WriteLine("Ingrese su nombre");
		   string name= Console.ReadLine();

           Console.WriteLine("Ingrese su apellido");
		   string surname= Console.ReadLine();

           Console.WriteLine("Ingrese su direccion");
		   string address = Console.ReadLine();

 	       Console.WriteLine("Ingrese su telefono");
		   string telefono = Console.ReadLine();

		   Console.WriteLine("Sus datos son: ");
		   Console.WriteLine("DNI: " + dni);
		   Console.WriteLine("Nombre: " + name);
		   Console.WriteLine("Apellido: " + surname);
		   Console.WriteLine("Direccion: " + address);
		   Console.WriteLine("Telefono: " + telefono);
        }
		   
    }
}
