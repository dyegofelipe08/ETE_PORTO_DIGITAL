programa
{
	
	funcao inicio()
	{
		inteiro n [10], soma

		soma=0

		escreva ("Digite dez números inteiros: \n\n")

		para (inteiro i = 0; i<=9; i++){
		escreva (i+1,"º:")
		leia (n[i])
		soma = soma + n[i]
		
		}

		limpa()
		escreva ("O somatório dos números digitados é:" +soma+"\n")

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */