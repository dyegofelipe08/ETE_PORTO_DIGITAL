programa
{
	
	funcao inicio()
	{
		real m, cm, mm

		escreva ("Olá! Digite um valor em metros e converterei ele para você em centímetros e milímetros:")
		leia (m)
		limpa()

		cm=m*100
		mm=m*1000

		escreva ("Você digitou: ", m, " m\n")
		escreva (m, " m é igual a ", cm, " cm e ", mm, " mm \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */