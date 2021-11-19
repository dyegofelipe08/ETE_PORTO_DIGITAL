using System;

namespace Exercicio01
{
    class Program
    {
        static void Main(string[] args)
        {
            Boolean teste = false;
            int acesso = 2002;
            while (teste == false)
            {
                Console.Write("Digite a senha:");
                int senha = int.Parse(Console.ReadLine());
                if (senha == acesso)
                {
                    teste = true;
                    Console.WriteLine("Acesso permitido!");
                }
                else
                {
                    Console.WriteLine("Senha inválida!");
                }
                
            }
            
           

        }
    }
}
