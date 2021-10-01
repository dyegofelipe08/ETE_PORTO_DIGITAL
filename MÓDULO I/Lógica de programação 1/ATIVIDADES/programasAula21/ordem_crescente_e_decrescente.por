programa
{
	
	funcao inicio()
	{
		inteiro x, y

		escreva ("Digite dois números: \n")
		leia(x)
		leia(y)

		enquanto (x!=y){
			
			se (x<y){
				escreva ("Números digitados: ", x, " e ", y,".","Ordem cresente\n")
				escreva ("\nDigite outros dois números para continuar ou dois números iguais para finalizar: \n")
				leia(x)
				leia (y) 
			}
			senao{
				escreva ("Números digitados: ", x, " e ", y,".","Ordem decresente\n")
				escreva ("\nDigite outros dois números para continuar ou dois números iguais para finalizar: \n")
				leia(x)
				leia (y)
			}

			
			
		}
		escreva ("Você digitou dois números iguais. Fim!\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */