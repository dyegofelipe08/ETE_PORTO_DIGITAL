using System;

namespace Exercicio02_17Nov
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um número inteiro: ");
            int x = int.Parse(Console.ReadLine());

            if (x % 2 == 0) Console.WriteLine("PAR");
            else Console.WriteLine("IMPAR");
        }
    }
}
