programa
{
	
	funcao inicio()
	{
		caracter estadoCivil
		inteiro c, s, v, i

		c=0
		s=0
		v=0
		
		para (i=0; i<=19; i++){
			escreva ("Qual seu estado civil?: ")
			escreva ("\n\nDigite: (S) - solteiro(a)\t(C) - casado(a)\t\t(V) - viúvo(a)\n\n")
			leia(estadoCivil)

			escolha(estadoCivil){
				caso 'c':
				c=c+1
				pare
				caso 'C':
				c=c+1
				pare
				caso 's':
				s=s+1
				pare
				caso 'S':
				s=s+1
				pare
				caso 'v':
				v=v+1
				pare
				caso 'V':
				v=v+1
				pare
				caso contrario:
				escreva ("Opção inválida!")
			}
		}

		escreva ("O número de solteiros(as) é: "+s+"\n")
		
		escreva ("O número de casados(as) é: "+c+"\n")
		
		escreva ("O número de viúvos(as) é: "+v+"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 697; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */