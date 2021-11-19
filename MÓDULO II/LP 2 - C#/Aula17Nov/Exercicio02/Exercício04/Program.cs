using System;

namespace Exercício04
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite a hora inicial do jogo: ");
            int hI = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite a hora final do jogo: ");
            int hF = int.Parse(Console.ReadLine());
            int duracaoJogo;

            if ((hI > hF) || (hI == hF)) duracaoJogo = (24 + hF) - hI;
            else duracaoJogo = hF - hI;

            Console.WriteLine($"O JOGO DUROU {duracaoJogo} HORA(S)");



        }
    }
}
