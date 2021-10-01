programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia nome, sobrenome
		real salario, nsalario, arred1, arred2

		escreva ("Olá, trabalhador! Bem-vindo!")
		escreva ("Digite, por favor o seu nome: ")
		leia (nome)
		escreva ("Agora, digite o seu sobrenome: ")
		leia (sobrenome)
		escreva ("Digite o seu salário atual R$: ")
		leia (salario)
		limpa ()

		escreva ("Parabéns! Vc acababa de ganhar um aumento de 15% no seu salário. \nConfira abaixo os seus dados e seu novo salário: \n")

		nsalario=salario*1.15
		arred1=mat.arredondar(salario, 2)
		arred2=mat.arredondar(nsalario, 2)


		
		escreva ("\n*****************************************************************************\n")
		escreva ("****************** DADOS E NOVO SALÁRIO DO TRABALHADOR **********************\n")
		escreva ("*****************************************************************************\n")

		escreva ("NOME: ", nome, "\nSOBRENOME: ", sobrenome, "\nSALÁRIO INICIAL: R$ ", arred1, "\nNOVO SALÁRIO: R$ ", arred2, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 804; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */