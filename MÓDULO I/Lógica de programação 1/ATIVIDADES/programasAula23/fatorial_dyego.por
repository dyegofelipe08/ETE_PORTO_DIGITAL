programa
{
	
	funcao inicio()
	{
		inteiro fat, n

		escreva ("Digite um número para calcular seu fatorial: ")
		leia (n)
		fat=1
		para (inteiro i=1; i<=n; i++){
			fat=fat*i
		}

		escreva("\nO fatorial de ", n," é: ", fat,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */