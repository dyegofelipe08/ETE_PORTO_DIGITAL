programa
{
	
	funcao inicio()
	{
		real a, b, c

		escreva ("Informe a medida do primeiro, segundo e terceiro lado, respectivamente: \n")
		leia (a, b, c)
		
		limpa()

		escreva ("Lado A: ", a, "\tLado B: ", b,"\tLAdo C: ", c, "\n") 

		se (a<(b+c) e b<(a+c) e c<(b+a)){
			escreva ("\nOs lados informados formam um triângulo.\n")
		}
		senao{
			escreva ("\nOs lados informados não formam um triângulo.\n")
		}
		
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */