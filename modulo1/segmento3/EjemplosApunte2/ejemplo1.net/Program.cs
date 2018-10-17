using System;

namespace ejemplo1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese una opcion (1,2 o 3): ");
			int opcion = int.Parse(Console.ReadLine());

			if(opcion ==1){
				Console.WriteLine("Eligio 1");
			}else if(opcion==2){
				Console.WriteLine("Eligio 2");
			
			}else if(opcion==3){
				Console.WriteLine("Eligio 3");
			
			}else{
				Console.WriteLine("opcion invalida");
			
			}
        }
    }
}
