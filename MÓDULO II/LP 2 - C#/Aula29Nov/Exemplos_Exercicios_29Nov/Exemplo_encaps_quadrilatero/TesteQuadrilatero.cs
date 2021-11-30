using System;

namespace Exemplo_encaps_quadrilatero
{
    class TesteQuadrilatero
    {
        static void Main(string[] args)
        {
            Quadrilatero objeto;

            objeto = new Quadrilatero();

            objeto.Altura = 5.0;
            objeto.Base = 2.0;

           double area = objeto.CalcularArea();
           double perimetro = objeto.CalcularPerimetro();

           Console.WriteLine($" A área é {area} m² e o perímetro é {perimetro} m.");



        }
    }
}
