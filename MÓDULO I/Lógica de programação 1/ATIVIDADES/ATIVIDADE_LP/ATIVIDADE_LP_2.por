programa
{
	
	funcao inicio()
	{
		inteiro quant, codigo
		real preco

		escreva ("\t\tCÓDIGOS:\n\n (1)\t (2)\t (3)\t (4)\t (5)\t\n\n")
		escreva ("Digite o código do produto que você deseja: ")
		leia (codigo)
		limpa()
		escreva ("Digite a quantidade que você deseja do produto: ")
		leia(quant)
		limpa()
		escolha(codigo){
			caso 1:
			escreva ("Ok. Pague R$ ",(quant*5.00)," no balcão. Obrigado!\n")
			pare
			caso 2:
			escreva ("Ok. Pague R$ ",(quant*3.50)," no balcão. Obrigado!\n")
			pare
			caso 3:
			escreva ("Ok. Pague R$ ",(quant*4.80)," no balcão. Obrigado!\n")
			pare
			caso 4:
			escreva ("Ok. Pague R$ ",(quant*8.90)," no balcão. Obrigado!\n")
			pare
			caso 5:
			escreva ("Ok. Pague R$ ",(quant*7.32)," no balcão. Obrigado!\n")
			pare
			caso contrario:
			escreva ("Código inválido!\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 817; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */