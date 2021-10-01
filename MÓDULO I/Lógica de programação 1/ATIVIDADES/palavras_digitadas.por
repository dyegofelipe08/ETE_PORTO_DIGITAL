programa
{
	
	funcao inicio()
	{
		cadeia palavra_digitada

		escreva ("Digite a palavra texto ou o número 1 :")
		leia(palavra_digitada)

		se (palavra_digitada == "texto"){
			escreva ("\nParabéns! Você digitou a palavra texto\n") 
		}
		senao se (palavra_digitada=="1"){
			escreva("\nVocê digitou o número 1\n")
		}
		senao {
			escreva ("\nVocê digitou textos incompatíveis com esse programa\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */