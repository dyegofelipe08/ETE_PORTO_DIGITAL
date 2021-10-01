programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real co, ca, hip, co2,ca2, soma, arredhip

		escreva("Digite o valor do cateto oposto: ")
		leia (co)
		escreva ("Digite o valor do cateto adjscente: ")
		leia (ca)
		
		co2=mat.potencia(co, 2)
		ca2=mat.potencia(ca, 2)
		soma=co2+ca2
		hip=mat.raiz(soma, 2)
		arredhip=mat.arredondar(hip, 2)
		

		escrevaLinha()
		escreva ("\nHIPOTENUSA = ", arredhip,"\n")
	}
	funcao escrevaLinha(){
		escreva ("-------------------------------------------------------")
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */