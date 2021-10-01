programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real d,r, arred

		escreva ("Quantos reais vc possui na sua carteira no momento?")
		leia (r)
		limpa()

		d=r/3.27
		arred=mat.arredondar(d, 2)
		escreva ("Vc disse que possui R$", r, " na sua carteira\n")
		escreva ("Com este saldo vc pode comprar $", arred," \n")

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */