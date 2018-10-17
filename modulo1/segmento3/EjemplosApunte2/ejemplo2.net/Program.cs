using System;

namespace ejemplo2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int number1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese un numero: ");
			int number2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese una operacion (+,-,* o /:): ");
			string operacion= Console.ReadLine();

			int resultado = 0;

			if(operacion=="+"){
				resultado= number1 + number2;
				Console.WriteLine("El resultado de la suma es: " + resultado );
			}else if(operacion=="-"){
				resultado= number1 - number2;
				Console.WriteLine("El resultado de la resta es: " + resultado );
			
			}else if(operacion=="*"){
				resultado= number1 * number2;
				Console.WriteLine("El resultado de la multiplicacion es: " + resultado );
			
			}else if(operacion=="/"){
				resultado= number1 / number2;
				Console.WriteLine("El resultado de la division es: " + resultado );
			
			}
        }
    }
}
