using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            //Exercicio 02 da aula do dia 26/10
            Console.WriteLine("Digite o valor do raio do círculo: ");
            double raio = double.Parse(Console.ReadLine());
            double area = Math.PI * Math.Pow(raio, 2);

            Console.WriteLine($"A área do círculo com o raio informado é {area:F4}");
        }
    }
}
