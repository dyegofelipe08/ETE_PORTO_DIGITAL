using System;

namespace ExeciciosForLista
{
    class Program
    {
        static void Main(string[] args)
        {
            int n, dentro=0, fora=0;
            Console.Write("Digite um valor inteiro: ");
            int x = int.Parse(Console.ReadLine());

            for(int i = 1; i<=x; i++)
            {
                Console.WriteLine($"Digite o {i}º de um total de {x} a serem digitados.");
                n = int.Parse(Console.ReadLine());
                if((n>=10) && (n <= 20))
                {
                    dentro++;
                }else {
                    fora++;
                }

            }
            Console.WriteLine($"{dentro} in e {fora} out. ");

        }
    }
}
