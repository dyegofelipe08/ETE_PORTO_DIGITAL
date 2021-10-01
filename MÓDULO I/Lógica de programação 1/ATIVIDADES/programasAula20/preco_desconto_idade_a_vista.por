programa
{
	inclua biblioteca Matematica -->mat
	inclua biblioteca Tipos -->tip
	funcao inicio()
	{
		inteiro idade,opcaoInteiro
		real preco, descont, descontIdade, descontIdadeAvista, arredd, arreddi, arreddiav
		cadeia opcao
		logico validaOpcao

		escreva ("Digite o preço do produto(R$): ")
		leia (preco)
		escreva ("\nDigite sua idade: ")
		leia (idade)
		limpa()

		descont=preco*0.90
		descontIdade=preco*0.95
		descontIdadeAvista=preco*0.85
		arredd=mat.arredondar(descont, 2)
		arreddi=mat.arredondar(descontIdade, 2)
		arreddiav=mat.arredondar(descontIdadeAvista, 2)
		
		escreva ("\nEscolha uma das condições de pagamento:\n")
		escreva ("\n 1 - À VISTA\t outro - OUTRO MEIO DE PAGAMENTO\n")
		escreva("\n\nDigite o código da sua opção: ")
		leia(opcao)
		limpa()

		validaOpcao=tip.cadeia_e_inteiro(opcao, 10)

		se ((validaOpcao==falso) e (idade<=60)){

			escreva ("SUA IDADE: ", idade,"\t\tPREÇO DO PRODUTO: R$", preco, "\t\tCÓDIGO DE OPÇÃO DE PAGAMENTO: ", opcao, "\n")
			escreva ("\nInfelizmente, de acordo com sua idade e nesta modalidade de pagamento não podemos te dar um deconto.\n")
			escreva ("\nPague R$ ", preco, " no balcão de atendimento. Obrigado!\n")
		}
		senao se ((validaOpcao==falso) e (idade>60)){
			escreva ("SUA IDADE: ", idade,"\t\tPREÇO DO PRODUTO: R$", preco, "\t\tCÓDIGO DE OPÇÃO DE PAGAMENTO: ", opcao, "\n")
			escreva ("\nParabéns! Por vc ter ",idade, " anos de idade, te daremos um desconto especial de 5%.\n")
			escreva ("\nPague R$ ",arreddi, " no balcão de pagamento. Obrigado!\n")
		}
		senao se (validaOpcao==verdadeiro){

			opcaoInteiro=tip.cadeia_para_inteiro(opcao,10)

			se ((opcaoInteiro==1) e (idade>60)){
				escreva ("SUA IDADE: ", idade,"\t\tPREÇO DO PRODUTO: R$", preco, "\t\tCÓDIGO DE OPÇÃO DE PAGAMENTO: ", opcao, "\n")
				escreva ("\nParabéns! Por você ter ", idade, " anos de idade e ter optado por pagar à vista, te daremos um desconto de 15%\n")
				escreva ("\nPague R$ ", arreddiav, " no balcão de atendimento. Obrigado!\n")
			}
			senao se ((opcaoInteiro==1) e (idade<=60)){
				escreva ("SUA IDADE: ", idade,"\t\tPREÇO DO PRODUTO: R$", preco, "\t\tCÓDIGO DE OPÇÃO DE PAGAMENTO: ", opcao, "\n")
				escreva ("\nParabéns! Por escoher pagar à vista, te daremos 10% de desconto.\n")
				escreva ("\nPague R$ ", arredd," no balcão de atendimento. Obrigado!\n")
			}
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2047; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */