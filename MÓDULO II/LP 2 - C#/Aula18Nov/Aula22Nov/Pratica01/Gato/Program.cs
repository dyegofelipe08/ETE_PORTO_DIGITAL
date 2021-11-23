using System;

namespace Gato
{
    public class Gato
    {

        public string nome;
        public string raca;
        public double peso;
        public int idade;

        public Gato(string _nome, string _raca, double _peso, int _idade)
        {
            nome = _nome;
            raca = _raca;
            peso = _peso;
            idade = _idade;
        }
        public void exibirInformacoes()
        {
            Console.WriteLine($"O gato {nome} é da raça {raca} tem {peso}Kgs e {idade} ano(s) de idade ");
        }

    }
}
