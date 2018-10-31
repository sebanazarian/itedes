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

			if (dia==1)
			{
				resultado="lunes";
			}
			else if(dia==2)
			{
					resultado="Martes";
			}
			else if(dia==3)
			{
				resultado="Miercoles";
			}
			else if(dia==4)
			{
				resultado="Jueves";
			}
			else if(dia==5)
			{
				resultado="Viernes";
			}
			else if(dia==6)
			{
				resultado="Sabado";
			}
			else if(dia==7)
			{
				resultado="domingo";
			}
			else
			{
				resultado="error";
			
			}

			Console.WriteLine(resultado);
        }
    }
}
