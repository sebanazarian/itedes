using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero: ");
			int number1= int.Parse(Console.ReadLine());
            Console.WriteLine("Ingrese un numero: ");
			int number2= int.Parse(Console.ReadLine());
            Console.WriteLine("Ingrese un numero: ");
			int number3= int.Parse(Console.ReadLine());

			if(number1>=number2 && number2>=number3)
			{
				Console.WriteLine(number1 +"-"+number2+"-"+number3);
			}
			else if(number2>=number3 && number3>=number1)
			{
				Console.WriteLine(number2 +"-"+number3+"-"+number1);
			}
			else if(number3>=number1 && number1>=number2)
			{
				Console.WriteLine(number3 +"-"+number1+"-"+number2);
			}
			else if(number1>=number3 && number3>=number2)
			{
				Console.WriteLine(number1 +"-"+number3+"-"+number2);
			}
			else if(number2>=number1 && number1>=number3)
			{
				Console.WriteLine(number2 +"-"+number1+"-"+number3);
			}
			else
			{
				Console.WriteLine(number3 +"-"+number2+"-"+number1);
			}
        }
    }
}
