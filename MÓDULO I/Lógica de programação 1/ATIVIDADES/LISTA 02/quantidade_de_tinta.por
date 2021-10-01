programa
{
	
	funcao inicio()
	{
		real altura, larg, area, tinta 

		escreva ("Digite a altura (m) da parede a pintar: ")
		leia (altura)
		escreva ("Digite a largura (m) da parede a pintar: ")
		leia (larg)
		limpa()
		area=altura*larg
		escreva ("Altura = ", altura, " m\n", "Largura = ", larg, " m\n", "Área = ", area, " m²\n")

		tinta=area/2

		escreva ("\nA quantidade de tinta necessária para pintar a parede com área calculada acima é de: ", tinta, " L\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */