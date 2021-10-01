programa
{
	
	funcao inicio()
	{
		real preco, desconto, npreco

		escreva ("Digite o preço (R$) do produto que vc deseja: ")
		leia (preco)
		limpa()

		desconto=(0.05*preco)
		npreco=(preco-desconto)

		escreva ("Parabéns! Vc acaba de ganhar 5% de desconto no preço deste produto. \n")
		escreva ("Você pode comprá-lo agora de R$ ", preco, " por apenas R$ ", npreco, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */