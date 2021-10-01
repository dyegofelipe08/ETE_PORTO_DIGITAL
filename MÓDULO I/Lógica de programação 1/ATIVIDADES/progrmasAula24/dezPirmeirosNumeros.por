programa
{
	
	funcao inicio()
	{
		inteiro n[15]
		
		escreva("Digite 15 números inteiros: ")

	
		para (inteiro i=0; i<=14; i++){
			escreva ("\n", i+1 +"º: ")
			leia (n[i])
		
		}

		escreva("Os primeiros 10 números digitados foram: \n")

		para (inteiro i=0; i<=9; i++){

			escreva (i+1,"º: "+n[i], "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */