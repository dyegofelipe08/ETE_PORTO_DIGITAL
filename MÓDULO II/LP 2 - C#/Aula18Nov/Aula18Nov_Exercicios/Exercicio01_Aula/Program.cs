using System;

namespace Exercicio01_Aula
{
    class Program
    {
        public static object F3 { get; private set; }

        static void Main(string[] args)
        {
            Boolean teste = true;
            double raizQ = 0;
            while (teste == true)
            {
                Console.Write("Digite um número nulo ou positivo: ");
                double num = double.Parse(Console.ReadLine());
                if (num < 0.0) {
                    teste = false;
                    Console.WriteLine("Número negativo!");
                }
                else {
                    raizQ = Math.Sqrt(num);
                    Console.WriteLine($"A raiz quadrada de {num} é = {raizQ.ToString("F3")}");
                }
            }
            

        }
    }
}
