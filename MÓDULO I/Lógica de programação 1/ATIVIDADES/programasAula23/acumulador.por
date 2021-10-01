programa
{
	
	funcao inicio()
	{
		inteiro idade, soma
		caracter sexo
		soma = 0

		para (inteiro i=0; i<5; i++){
			escreva ("Difite F para sexo feminino e M para masculino: \n")
			leia (sexo)
			escreva ("Digite sua idade: \n")
			leia (idade)

			se ((sexo == 'F') e (idade>=18))
			soma = soma + idade
		}
		escreva ("A quantidade de pessoas do sexo feminino com 18 anos ou mais é: ", soma)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */