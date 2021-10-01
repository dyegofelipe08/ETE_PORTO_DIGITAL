programa
{
	
	funcao inicio()
	{
		inteiro n[15]

		escreva ("Digite 15 números inteiros: \n\n")

		para (inteiro i=0; i<=14; i++){
			escreva (i+1, "º : ")
			leia (n[i])
			
		}

		limpa()

		escreva ("Os números positivos do vetor são: \n")
		
		para (inteiro i=0; i<=14; i++){
			
			se ((n[i]>=0)){
				escreva (n[i], " | ")
				
				
			}
		}

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */