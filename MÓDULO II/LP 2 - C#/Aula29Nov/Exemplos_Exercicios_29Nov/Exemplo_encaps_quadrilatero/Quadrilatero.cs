using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exemplo_encaps_quadrilatero
{
    class Quadrilatero
    {
        public double Base { get; set; }
        public double Altura { get; set; }

        public double CalcularArea()
        {
            return Base * Altura;
        }
        public double CalcularPerimetro()
        {
            return (Base*2) + (Altura*2);
        }
    }
}
