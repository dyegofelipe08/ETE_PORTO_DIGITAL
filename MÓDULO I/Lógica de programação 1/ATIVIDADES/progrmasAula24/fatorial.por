programa
{
	
	funcao inicio()
	{
		inteiro n, i, fat

		escreva("Digite um número para sabermos seu fatorial: ")
		leia(n)
		fat = 1
		
		para (i = 1; i <= n; i++)
		{
			fat = fat * i
		}
		escreva("O resultado de ",n,"! é: ",fat)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */