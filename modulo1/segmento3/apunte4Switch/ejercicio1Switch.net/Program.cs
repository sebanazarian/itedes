using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un nro de dia: ");
			int dia = int.Parse(Console.ReadLine());

			string resultado;

			switch (dia)
			{
				case 1:
					resultado="lunes";
					break;
				case 2:
					resultado="Martes";
					break;
				case 3:
					resultado="Miercoles";
					break;
				case 4:
					resultado="Jueves";
					break;
				case 5:
					resultado="Viernes";
					break;
				case 6:
					resultado="Sabado";
					break;
				case 7:
					resultado="domingo";
					break;
				default:
					resultado="error";
					break;
			}

			Console.WriteLine("El dia es " + resultado);
        }
    }
}
