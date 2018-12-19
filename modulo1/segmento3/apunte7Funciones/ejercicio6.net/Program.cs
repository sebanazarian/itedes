using System;

namespace ejercicio6.net
{
    class Program
    {
        public static int sumar(int number1,int number2)
        {
            int total;
            total = number1+number2;
            return total;   
        }

         public static int potencia(int number1,int number2)
        {
            int total=number1;
            for(int i=1;i<number2;i++)
            {
                total *= number1;
            }
            
            return total;   
        }
         public static int restar(int number1,int number2)
        {
            int total;
            total = number1-number2;
            return total;   
        }
         public static int multiplicar(int number1,int number2)
        {
            int total;
            total = number1*number2;
            return total;   
        }
         public static int dividir(int number1,int number2)
        {
            int total;
            total = number1/number2;
            return total;   
        }
        static void Main(string[] args)
        {
            string opcionMenu="1";
            int number1;
            int number2,total;

            while(opcionMenu!="0")
            {
                Console.WriteLine("1-Sumar");
                Console.WriteLine("2-Restar");
                Console.WriteLine("3-Multiplicar");
                Console.WriteLine("4-Divison");
                Console.WriteLine("5-Potencia");
                Console.WriteLine("0-Salir");
                Console.WriteLine("Ingrese la opcion deseada");
                opcionMenu=Console.ReadLine();

                switch(opcionMenu)
                {
                    case "1":
                        Console.Clear();
                        Console.WriteLine("Ingrese un numero: ");
                        number1=int.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese un numero: ");
                        number2=int.Parse(Console.ReadLine());
                        total = sumar(number1,number2);
                        Console.WriteLine("El total de la suma es: " + total);
                        break;
                    case "2":
                        Console.Clear();
                        Console.WriteLine("Ingrese un numero: ");
                        number1=int.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese un numero: ");
                        number2=int.Parse(Console.ReadLine());
                        total = restar(number1,number2);
                        Console.WriteLine("El total de la resta es: " + total);
                        break;
                    case "3":
                        Console.Clear();
                        Console.WriteLine("Ingrese un numero: ");
                        number1=int.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese un numero: ");
                        number2=int.Parse(Console.ReadLine());
                        total = multiplicar(number1,number2);
                        Console.WriteLine("El total de la multiplicacion es: " + total);
                        break;
                    case "4":
                        Console.Clear();
                        Console.WriteLine("Ingrese un numero: ");
                        number1=int.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese un numero: ");
                        number2=int.Parse(Console.ReadLine());
                        total = dividir(number1,number2);
                        Console.WriteLine("El total de la division es: " + total);
                        break;
                    case "5":
                        Console.Clear();
                        Console.WriteLine("Ingrese un numero: ");
                        number1=int.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese un numero: ");
                        number2=int.Parse(Console.ReadLine());
                        total = potencia(number1,number2);
                        Console.WriteLine("El total de la potencia es: " + total);
                        break;
                    default:
                        Console.Clear();
                        Console.WriteLine("Ingrese una opcion correcta!!");
                        break;
                }
            }
            
        }
    }
}
