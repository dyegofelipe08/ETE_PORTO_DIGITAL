programa
{
	
	funcao inicio()
	{
		cadeia nome
		real quanth, valorh, pag

		escreva ("Nome do funcionário: ")
		leia (nome)
		escreva ("Quantidade de horas trabalhadas: ")
		leia (quanth)
		escreva ("Valor que recebe por hora: ")
		leia (valorh)

		pag=quanth*valorh

		limpa()

		escreva ("NOME DO FUNCIONÁRIO: ", nome, "\n")
		escreva ("VALOR DA HORA: R$", valorh, "\tHORAS TRABALHADAS: ",quanth," H\n")
		escreva ("SALÁRIO DO MÊS R$", pag, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */