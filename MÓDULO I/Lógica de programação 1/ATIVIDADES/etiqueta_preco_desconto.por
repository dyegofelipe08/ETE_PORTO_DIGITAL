programa
{
	inclua biblioteca Tipos -->tip
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real preco, pdesc0, pdesc1, pdesc2, pdesc3, arred0, arred1, arred2, arred3
		inteiro validaForma
		cadeia nome, forma
		logico testeForma
		

		escreva ("Digite seu nome, por favor: ")
		leia (nome)
		limpa()
		escreva ("Olá, ", nome, "! Seja bem-vindo.\n")
		escreva ("\nDigite o preço de etiqueta do produto que você deseja comprar, por favor(R$): ")
		leia (preco)
		limpa()
		escreva ("Este produto está por R$", preco, ", mas vc pode obter um desconto a depender da forma de pagamento.")
		escreva ("\nComo dejesa pagar seu porduto?\n")
		escreva ("\nDigite uma das opções abaixo: \n\n")
		escreva ("0 - À vista(25%)\t 1 - Cheque(30 dias)(20%)\t 2 - Cartão de crédito(2x)(10%)\t") 
		escreva ("\n\n3 - Cartão de crédito(3x)(5%)\t outra - Negociar com vendedor(Sem desconto)\n")
		escreva ("\nOPÇÃO:")
		leia(forma)
		
		pdesc0=preco*0.75
		pdesc1=preco*0.80
		pdesc2=preco*0.90
		pdesc3=preco*0.95
		arred0=mat.arredondar(pdesc0, 2)
		arred1=mat.arredondar(pdesc1, 2)
		arred2=mat.arredondar(pdesc3, 2)
		arred3=mat.arredondar(pdesc3, 2)

		testeForma=tip.cadeia_e_inteiro(forma, 10)

		se (testeForma==falso){
			escreva ("\nInfelizmente, para essa opção não oferecemos desconto. Pague R$", preco," no balcão  de atendimento. Obrigado!\n")
		}
		senao {
			
			validaForma=tip.cadeia_para_inteiro(forma, 10)
		
		se (validaForma==0){
			escreva ("\nVocê optou por pagar à vista. Pague R$", arred0," no balcão  de atendimento. Obrigado!\n")
		}
		senao se (validaForma==1){
			escreva ("\nVocê optou por pagar com cheque. Pague R$", arred1," no balcão  de atendimento. Obrigado!\n")
		}
		senao se (validaForma==2){
			escreva ("\nVocê optou por pagar em 2x no cartão de crédito. Pague R$", arred2," no balcão  de atendimento . Obrigado!\n")
		}
		senao se (validaForma==3){
			escreva ("\nVocê optou por pagar em 3x no cartão de crédito. Pague R$", arred3," no balcão  de atendimento. Obrigado!\n")
		}
		
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */