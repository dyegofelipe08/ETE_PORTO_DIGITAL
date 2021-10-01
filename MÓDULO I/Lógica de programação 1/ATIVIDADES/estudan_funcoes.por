programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anos, nasceu
		
		escreva ("Digite seu nome: ")
		leia (nome)
		limpa()
		escreva ("Quantos anos você tem?")
		leia (anos)
		limpa()

		nasceu=nascimento(anos)
		
		linha()
		saudacao(nome)
		escreva ("\nVocê nasceu em ", nasceu)
		linha()
	}
	funcao linha() {
		escreva ("\n-------------------\n")
	}
	funcao saudacao (cadeia nome){
		
		escreva ("Olá, ", nome ,"!")
	}
	funcao inteiro nascimento (inteiro idade){
		inteiro ano=2021-idade 
		retorne ano
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */