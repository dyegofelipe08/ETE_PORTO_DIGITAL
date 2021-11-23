using System;

namespace testeGato
{
    internal class Gato
    {
        private string v1;
        private string v2;
        private double v3;
        private int v4;

        public Gato(string v1, string v2, double v3, int v4)
        {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
            this.v4 = v4;
        }

        internal void exibirInformacoes()
        {
            Console.WriteLine($"O gato {v1} é da raça {v2} tem {v3}Kgs e {v4} ano(s) de idade ");
        }
    }
}