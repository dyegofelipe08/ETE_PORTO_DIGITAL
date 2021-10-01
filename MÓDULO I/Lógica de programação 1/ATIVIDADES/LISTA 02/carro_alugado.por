programa
{
	
	funcao inicio()
	{
		real  km, total
		inteiro dia
		
		escreva("Olá! Obrigado por alugar um de nossos carros. \n") 
		escreva ("O veículo escolhido tem um custo de R$ 60,00 por dia de uso mais R$ 0,15 por Km rodado.\n")
		escreva ("\nNos confirme, por favor, a quantidade de dias que você permaneceu com o veículo: ")
		leia (dia)
		escreva ("\nInforme o total de Km rodado, por favor: ")
		leia (km)
		limpa()

		total = (dia*60)+(km*0.15)

		escreva ("TEMPO DE PERMANÊNCIA COM O VEÍCULO: ", dia, " DIAS.\n")
		escreva ("QUILÔMETROS RODADOS: ", km, " KM. \n")
		escreva ("VALOR TOTAL A PAGAR: R$ ", total, ".\n")
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 69; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */