using System;

namespace ExemploMetodo
{
    class Program
    {
        
        public static void saudarBoasVindas()
        {
            Console.Write("Digite o seu nome: ");
            string nome = Console.ReadLine();
            Console.WriteLine($"Seja bem-vindo Sr.(a), {nome} ");

        }
        static void Main(string[] args)
        {

            saudarBoasVindas();
        }
    }
}
