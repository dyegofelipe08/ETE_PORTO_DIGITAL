programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro n1, n2
		
		escreva ("Digite seu nome, por gentileza: ")
		leia (nome)
		limpa()
		escreva ("Olá ,",nome,"! \n")
		escreva ("Vou precisar que vc me forneca dois números inteiros, por favor. Digite o primeiro: ")
		leia (n1)
		escreva ("Agora, digite mais um, por favor: ")
		leia (n2)
		escreva ("\n**********************************************************************\n")
		escreva ("***************** Vamos comparar os números digitados ****************\n")
		escreva ("**********************************************************************\n")
		
		escreva (n1, " é igual a ", n2, ": ", n1==n2, "\n")
		escreva (n1, " é menor que ", n2, ": ", n1<n2, "\n")
		escreva (n1, " é maior que ", n2, ": ",n1>n2, "\n")
		escreva (n1, " é menor ou igual a ", n2, ": ",n1<=n2, "\n")
		escreva (n1, " é maior ou igual a ", n2, ": ",n1>=n2, "\n")
		escreva (n1, " é diferente de ", n2, ": ",n1!=n2, "\n")
		escreva (">>> Fim da execução do programa <<<")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */