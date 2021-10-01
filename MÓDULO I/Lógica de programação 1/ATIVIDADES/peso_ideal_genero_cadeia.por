programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real h, pidealh, arredh, pidealm, arredm
		cadeia genero

		escreva ("Vamos calcular o seu peso ideal. Digite sua altura (m), por favor: \n")
		leia (h)
		pidealh=(72.7*h)-58
		pidealm=(62.1*h)-44.7
		arredh=mat.arredondar(pidealh, 2)
		arredm=mat.arredondar(pidealm, 2)
		limpa()
		
		escreva ("Seu gênero é masculino ou feminino? (Digite tudo em minúsculo, por favor.)\n")
		leia (genero)
		limpa()

		se (genero == ("masculino")) {
			escreva ("Seu gênero é ", genero, ".  Sua altura é ", h, " m. Logo seu peso ideal é: ", arredh," Kg\n") 
			
		}
		
		senao {
			escreva ("Seu gênero é ", genero, ". Sua altura é ", h, " m. Logo seu peso ideal é: ", arredm, " Kg\n") 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 695; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */