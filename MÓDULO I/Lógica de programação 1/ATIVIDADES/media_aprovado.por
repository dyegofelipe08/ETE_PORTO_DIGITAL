programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real nota1, nota2,nota3, media, arred

		escreva ("Digite a primeira nota: \n")
		leia (nota1)
		escreva ("Digite a segunda nota: \n")
		leia (nota2)
		escreva ("Digite a terceira nota: \n")
		leia (nota3)
		limpa()
		
		escreva("Você digitou as seguintes notas: ", nota1,"; ", nota2, " e ", nota3, "\n")
		
		media=(nota1+nota2+nota3)/3
		arred=mat.arredondar(media, 2)

		se (media>6)
		{
			escreva ("\nSua média foi: ", arred, "\n\nAprovado!\n")
		}

		
		
		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */