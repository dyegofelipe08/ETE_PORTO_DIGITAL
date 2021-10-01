programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n, dobro, triplo, raiz2

		escreva ("Digite um número qualquer: ")
		leia (n)
		limpa()
		dobro=n*2
		triplo=n*3
		raiz2=mat.raiz(n, 2)

		escreva ("Você digitou: ", n, "\n")

		escreva(" O dobro, o triplo e a raiz quadrada de ", n, " são, respectivamente: ", dobro, ", ",triplo," e ", raiz2,"\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */