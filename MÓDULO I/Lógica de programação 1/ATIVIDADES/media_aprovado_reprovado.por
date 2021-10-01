programa
{
	
	funcao inicio()
	{
		real n1, n2, media
		inteiro faltas
		
		escreva("Olá, professor. Digite a nota da primeira avaliação deste aluno: ")
		leia (n1)
		escreva ("Digite a nota referente à segunda avaliação: ")
		leia (n2)
		limpa()
		escreva ("Digte o número de faltas deste aluno: ")
		leia(faltas)
		
		media=(n1+n2)/2

		se ((media >=6) e (faltas<=12)) {
			escreva ("A média do aluno é: ", media, " e ele tem até 12 faltas. \nALUNO APROVADO.\n")
		}
		senao{
			escreva ("A média é: ", media, " e o número de faltas é " ,faltas, "\nALUNO REPROVADO.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */