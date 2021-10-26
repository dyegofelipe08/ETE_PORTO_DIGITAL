using System;

namespace Aula25._10
{
    class Program
    {
        static void Main(string[] args)
        {
            /*double a = 1, b = -3, c = -4;
            double delta = Math.Pow(b, 2) - 4 * a * c;
            double x1 = -b + Math.Sqrt((delta) / 2 * a);
            double x2 = -b - Math.Sqrt((delta) / 2 * a);

            Console.WriteLine(delta);
            Console.WriteLine(x1);
            Console.WriteLine(x2);*/

            /*Console.Write("Digite algo:");
            string msg = Console.ReadLine();
            Console.WriteLine(msg);*/

            //string s = Console.ReadLine();

            /*int num = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(num);
            double num2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine(num2);
            char ch = Convert.ToChar(Console.ReadLine());
            Console.WriteLine(ch);
            int v1 = int.Parse(Console.ReadLine());*/

            Console.Write("Entre com seu nome completo: ");
            string nome = Console.ReadLine();
            Console.Write("Quantos quartos tem na sua casa?: ");
            int quartos = int.Parse(Console.ReadLine());
            Console.Write("Entre com o preço de um produto: ");
            double preco = double.Parse(Console.ReadLine());
            Console.Write("Entre com seu último nome, idade e altura : ");
            string s = Console.ReadLine();
            string[] vet = s.Split(' ');

            Console.WriteLine(nome);
            Console.WriteLine(quartos);
            Console.WriteLine($"{preco:F2}");
            Console.WriteLine(vet[0]);
            Console.WriteLine(vet[1]);
            Console.WriteLine(vet[2]);













        }
    }
}
