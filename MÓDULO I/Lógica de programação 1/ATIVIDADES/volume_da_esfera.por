programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real V, raio, pi, r3
		

		escreva ("Vamos calcular o volume de uma esfera! \n")
		escreva ("Digite o valor do raio da esfera que vc deseja calcular: ")
		leia (raio)
		limpa()
		pi = 3.14
		r3 = mat.potencia(raio, 3.0)
		V = (4*pi*r3)/3
		escreva ("O volume para o raio ", raio, " é igual a: ", V, "\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */