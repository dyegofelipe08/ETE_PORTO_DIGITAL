using System;

namespace testes_avaliacao
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] carros = new string[3];
            carros[0] = "fiat uno";
            carros[1] = "fiesta";
            carros[2] = "gol";

            foreach (var carro in carros)
            {
                Console.WriteLine(carro +", ");
            }


        }
    }
}
