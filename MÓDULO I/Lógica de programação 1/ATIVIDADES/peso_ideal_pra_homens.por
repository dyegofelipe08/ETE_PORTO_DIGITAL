programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real h, pideal, arred

		escreva ("Vamos calcular o seu peso ideal. Digite sua altura (m), por favor: ")
		leia (h)
		pideal=(72.7*h)-58
		arred=mat.arredondar(pideal, 2)
		escreva (" Seu peso ideal é: ", arred, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */