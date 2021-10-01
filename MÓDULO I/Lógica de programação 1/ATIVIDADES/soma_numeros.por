programa
{
	
	funcao inicio()
	{
		inteiro x, soma

		soma=0
		escreva ("Digite o primeiro número ou (zero) para finalizar: ")
		leia (x)

		enquanto (x!= 0){
			soma = soma+x
			escreva ("Digite outro número ou (zero) para finalizar: ")
			leia (x)
			
		}

		escreva ("SOMA = ", soma)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */