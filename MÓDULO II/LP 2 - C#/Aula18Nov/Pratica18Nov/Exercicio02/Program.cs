using System;

namespace Exercicio02
{
    class Program
    {
        static void Main(string[] args)
        {
            Boolean teste = true;
            int x;
            int y;
            while (teste == true)

            {
                Console.Write("Digite a coordenada X: ");
                x = int.Parse(Console.ReadLine());
                Console.Write("Digite a coordenada Y: ");
                y = int.Parse(Console.ReadLine());
                if ((x > 0) && (y > 0))
                {
                    Console.WriteLine("Primeiro quadrante.");
                }
                else if ((x < 0) && (y > 0))
                {
                    Console.WriteLine("Segundo quadrante.");
                }
                else if ((x < 0) && (y < 0))
                {
                    Console.WriteLine("Terceiro quadrante.");
                }
                else if ((x > 0) && (y < 0))
                {
                    Console.WriteLine("Quarto quadrante.");

                }
                else
                {
                    teste = false;
                }
            }
            
        }

        
    }
}
