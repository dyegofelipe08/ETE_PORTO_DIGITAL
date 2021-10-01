programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		cadeia municipio
		real  eleitores, validos1, brancos2, nulos3, percent1, percent2, percent3, arred1, arred2, arred3

		/*Tentei incluir eleitores, votos válidos, brancos e nulos 
		como variável do tipo inteiro, mas afeteu no resultado final.*/
		
		escreva ("Digite o nome do seu município: ")
		leia (municipio)
		limpa()
		escreva ("Digite o número total de eleitores desse município:")
		//67.606 em Abreu e Lima
		leia (eleitores)
		limpa()
		escreva ("Digite o número de votos válidos do seu município nas últimas eleições: ")
		//59.816 em Abreu e Lima
		leia(validos1)
		limpa()
		escreva ("Digite o número de votos brancos do seu município nas últimas eleiçoes: ")
		//2.689 em Abreu e Lima
		leia (brancos2)
		limpa()
		escreva ("Digite o número de votos nulos do seu município nas últimas eleiçoes: ")
		//5.101 em Abreu e Lima
		leia (nulos3)
		limpa()

		percent1=(validos1*100)/eleitores
		percent2=(brancos2*100)/eleitores
		percent3=(nulos3*100)/eleitores

		arred1=mat.arredondar(percent1, 2)
		arred2=mat.arredondar(percent2, 2)
		arred3=mat.arredondar(percent3, 2)

	

		limpa()

		escreva ("****************** RESULTADO*********************\n")
		escreva ("\nMUNICÍPIO: ",municipio, "\n")
		escreva ("TOTAL DE ELEITORES: ", eleitores, "\n")
		escreva ("VOTOS VALIDOS: ", arred1,"% \n")
		escreva ("VOTOS BRANCOS: ",arred2, "% \n")
		escreva ("VOTOS NULOS: ", arred3, "% \n")
		
		
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */