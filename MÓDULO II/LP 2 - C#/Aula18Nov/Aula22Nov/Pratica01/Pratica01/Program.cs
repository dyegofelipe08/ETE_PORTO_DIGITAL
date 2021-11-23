using System;

namespace Pratica01
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] frutas = new string[3];

            for (int i = 0; i < 3; i++)
            {
                Console.Write($"Digite o nome da fruta {i + 1} ");
                frutas[i] = Console.ReadLine();
            }

            foreach (string fruta in frutas)
            {
                Console.Write(fruta + ", ");
            }
        }
    }
}
