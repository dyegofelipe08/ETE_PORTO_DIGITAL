programa
{
	
	funcao inicio()
	{
		inteiro n1,n2,n3

		escreva ("Digite o primeiro número:")
		leia (n1)
		escreva ("\nDigite o segundo número: ")
		leia (n2)
		escreva ("\nDigite o terceiro número: ")
		leia (n3)

		se ((n1<n2)e(n1<n3)){
			escreva ("\nO menor número digitado é: ", n1, "\n")
		}
		senao se ((n2<n1)e(n2<n3)){
			escreva ("\nO menor número digitado é: ", n2, "\n")
		}
		senao{
			escreva ("\nO menor número digitado é: ", n3, "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */