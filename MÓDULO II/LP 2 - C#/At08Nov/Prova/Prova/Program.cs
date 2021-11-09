using System;

namespace Prova
{
    class Program
    {
        static void Main(string[] args)
        {
            string texto = "estou estudando c#";
            string[] array = texto.Split(" ");
            Console.WriteLine(array[0]);
            Console.WriteLine(array[1]);
            Console.WriteLine(array[2]);
            Console.ReadLine();
            
            //double nota = ParseTo.Double(Console.ReadLine());
            //double nota = double.Parse(Console.ReadLine());
            
    }
}
