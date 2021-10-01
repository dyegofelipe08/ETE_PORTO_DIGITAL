programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real h, pidealh, arredh, pidealm, arredm
		inteiro genero

		escreva ("Vamos calcular o seu peso ideal. Digite sua altura (m), por favor: \n")
		leia (h)
		pidealh=(72.7*h)-58
		pidealm=(62.1*h)-44.7
		arredh=mat.arredondar(pidealh, 2)
		arredm=mat.arredondar(pidealm, 2)
		limpa()
		
		escreva ("Seu gênero é masculino (Digite 1) ou feminino (Digite 2)?\n")
		leia (genero)
		limpa()

		se (genero == 1) {
			escreva ("Seu gênero é masculino. Sua altura é ", h, ". Logo seu peso ideal é: ", arredh," Kg\n") 
			
		}
		
		senao {
			escreva ("Seu gênero é feminino. Sua altura é ", h, ". Logo seu peso ideal é: ", arredm, " Kg\n") 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */