programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real n1, n2, soma, arredn1, arredn2, arredsoma

		escreva ("Digite a nota da primeira AV: ")
		leia (n1)
		escreva ("Digite a nota da segunda AV:")
		leia (n2)
		limpa()

		soma=n1+n2
		arredsoma=mat.arredondar(soma, 1)
		arredn1=mat.arredondar(n1, 1)
		arredn2=mat.arredondar(n2, 1)

		se (soma<60.0){
			linhaResult()
			escreva ("PRIMEIRO AV: ", arredn1, "\tSEGUNDA AV: ", arredn2, "\t")
			escreva ("\nNOTA FINAL: ", arredsoma, "\n")
			escreva ("\t\tREPROVADO\n")
		}
		senao {
			linhaResult()
			escreva ("PRIMEIRO AV: ", arredn1, "\tSEGUNDA AV: ", arredn2, "\t")
			escreva ("\nNOTA FINAL: ", arredsoma, "\n")
			escreva ("\t\tAPROVADO\n")
			
		}
		

	}
	
	funcao linhaResult(){
		escreva("\n----------------RESULTADO---------------------\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */