programa
{
	
	funcao inicio()
	{
		inteiro hora, caracter horae

		escreva ("Digite a hora: ")
		leia (hora)

		se (hora< 12){
			escreva ("Bom dia!")
		}
		senao se (hora<18){
			escreva ("Boa tarde!")
		}
		senao se (hora>=18){
			escreva ("Boa noite!")
		}
		senao {
			escreva ("Inicie o programa novamente, por favor. Mas dessa vez escreva a hora inteira. Obrigado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 68; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */