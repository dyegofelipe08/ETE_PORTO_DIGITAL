programa
{
	
	funcao inicio()
	{
		inteiro n[8], n2, i
		logico teste=falso

		escreva ("Digite 8 números inteiros: \n")

		para (i=0; i<=7; i++){
			escreva (i+1,"º : ")
			leia (n[i])
			
		}

		limpa()
		escreva ("Digite um número inteiro qualquer: ")
		leia (n2)

		para (i=0; i<=7; i++){

			se (n2==n[i]){
			escreva ("\nEste número encontra-se na ", i+1, "ª posição do vetor.\n")
			teste=verdadeiro
			}
			
				
			}
			se (teste==falso){
				escreva ("\nEste número não se encontra no vetor.\n")
			}
				
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */