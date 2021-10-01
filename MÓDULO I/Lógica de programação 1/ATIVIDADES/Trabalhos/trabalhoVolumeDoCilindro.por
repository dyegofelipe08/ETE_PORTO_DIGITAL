programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		//Cálculo do volume de cilindros (V=pi x r² x h)
		
		real v, r, h, r2, arredv
		const real PI=3.14

		escreva ("Olá! Neste programada você pode calcular o volume de um cilindro qualquer em m³.\n\n")
		escreva("Forneça o raio da base do cilindro a calcular(m): ")
		leia (r)
		escreva ("Forneça a altura do cilindro a calcular (m): ")
		leia (h)
		limpa()

		r2=mat.potencia(r, 2)
		v=PI*r2*h
		arredv=mat.arredondar(v, 2)
		
		escreveLinha()
		escreva ("\t\t\t  DADOS\n")
		escreva ("RAIO DA BASE = ", r," m", "\t\t\tALTURA = ", h, " m")
		escreveLinha()
		escreva ("\t\t\tRESULTADO\n")
		escreva ("\n\t\t    VOLUME = ", arredv, " m³")
		escreveLinha()
		
	
	
	}
	funcao escreveLinha(){
		escreva ("\n___________________________________________________________\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */