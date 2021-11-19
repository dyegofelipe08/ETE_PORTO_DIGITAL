using System;

namespace Aula17Nov
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite trÊs números inteiros:");
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());

            int maior = 0;

            if (a > maior) maior = a;
            if (b > maior) maior = b;
            if (c > maior) maior = c;

            Console.WriteLine($"O maior número digitado foi: {maior}");


        }
    }
}
