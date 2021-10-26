using System;

namespace Exercicio03
{
    class Program
    {
        static void Main(string[] args)
        {
            //exercicio 03 da aula do dia 26/10

            Console.WriteLine("Digite o valor de A: ");
            int A = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite o valor de B: ");
            int B = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite o valor de C: ");
            int C = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite o valor de D: ");
            int D = int.Parse(Console.ReadLine());

            int diferenca = ((A * B) - (C * D));

            Console.WriteLine($"DIFERENÇA = {diferenca}");

        }
    }
}
