programa
{
	
	funcao inicio()
	{
		cadeia nome [5]

		para (inteiro i=0; i<=4; i++){
			escreva ("Digite o nome da posição "+i+":")
			leia (nome[i])
			limpa()
		}
		para (inteiro i=0; i<=4; i++){
			escreva (i +": "+nome[i]+" | ") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */