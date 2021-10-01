programa
{
	inclua biblioteca Calendario
	
	
	funcao inicio()
	{
		inteiro ano, idade, ano_atual
		
		escreva("Olá! Digte seu ano de nasciemnto, por favor: ")
		leia (ano)

		ano_atual=Calendario.ano_atual()
		idade=ano_atual-ano

		escreva ("\nSua idade é: ", idade, " anos. Ou provavelmente vc ainda vai completar essa idade neste ano.\n")

		se ((idade>=16) e (idade>=18)){
			escreva ("\nJá pode votar.\n")
			escreva ("\nJá pode solicitar a Carteira de Habilitação.\n")
		}
		senao se (idade<16){
			escreva ("\nNão pode votar nem solicitar habilitação.\n")
			
		}
		senao {
			escreva ("\nJá pode votar.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */