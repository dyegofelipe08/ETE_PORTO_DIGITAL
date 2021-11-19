using System;

namespace Exercicio03
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite dois números: ");
            int x = int.Parse(Console.ReadLine());
            int y = int.Parse(Console.ReadLine());
            int restoDivisao = 0;

            if (x > y) restoDivisao = (x % y);
            else restoDivisao = (y % x);

            if (restoDivisao == 0) Console.WriteLine("São Múltiplos");
            else Console.WriteLine("Não são Múltiplos");


        }
    }
}
