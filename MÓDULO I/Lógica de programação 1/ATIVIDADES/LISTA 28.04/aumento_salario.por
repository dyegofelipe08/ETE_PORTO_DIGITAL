programa
{
	
	funcao inicio()
	{
		real salario, salario2

		escreva ("Olá, funcionário! Digite seu salário (R$): ")
		leia (salario)

		se (salario<=500.00){
			salario2=salario*1.30
			escreva ("\nParabéns! Você teve direito a um aumento de 30% sobre seu salário.\n")
			escreva ("\nSeu novo salario é: R$", salario2,"\n")
		}
		senao se ((salario>500.00) e (salario<=750.00)){
			salario2=salario*1.15
			escreva ("\nParabéns! Você teve direito a um aumento de 15% sobre seu salário.\n")
			escreva ("\nSeu novo salario é: R$", salario2,"\n")
		}
		senao {
			escreva ("\nComo você recebe R$",salario,". Infelizmente, você não tem direito a aumento.\n ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */