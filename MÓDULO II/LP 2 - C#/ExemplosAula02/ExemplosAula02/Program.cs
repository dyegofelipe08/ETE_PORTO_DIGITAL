using System;
using System.Globalization;

namespace ExemplosAula02
{
    class Program
    {
        static void Main(string[] args)
        {
            string produto1 = "Computador";
            string produto2 = "Mesa de escritório";
            byte idade = 30;
            int cod = 5290;
            char genero = 'M';
            double preco1 = 2100.0;
            double preco2 = 650.50;
            double medida = 53.23456700;

            Console.WriteLine("Produtos:"); 
            Console.WriteLine($"{produto1}, cujo preço é ${preco1}");
            Console.WriteLine($"{produto2}, cujo preço é ${preco2}");
            Console.WriteLine();
            Console.WriteLine($"Registro: {idade} anos de idade, código:{cod} e gênero: {genero}");
            Console.WriteLine();
            Console.WriteLine($"Medida com 8 casas decimais: {medida}");
            Console.WriteLine($"Arredondando (três casas decimais): {medida:F3}");
            Console.WriteLine("Separador decimal invariant culture: " + medida.ToString("F3", CultureInfo.InvariantCulture));
            Console.WriteLine($"Separador decimal invariant culture: {medida.ToString("F3",CultureInfo.InvariantCulture)}");




         

            
        }
    }
}
