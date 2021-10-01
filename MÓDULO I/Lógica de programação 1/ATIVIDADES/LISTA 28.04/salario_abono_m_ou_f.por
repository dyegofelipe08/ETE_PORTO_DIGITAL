programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade,sexo
		real salario1, salario2

		escreva ("Digite seu nome completo: ")
		leia(nome)
		escreva ("\nDigite sua idade: ")
		leia(idade)
		escreva ("\nDigite seu salário fixo R$: ")
		leia(salario1)
		escreva ("\n\nEscolha uma das opções abaixo em relação ao seu sexo: ")
		escreva ("\n(1) - Masculino\t\t(2)-Feminino\n")
		leia(sexo)
		limpa()
	
		enquanto ((sexo!=1) e (sexo!=2)){
			
			escreva("Opção inválida!\n")
			escreva ("\n\nEscolha uma das opções abaixo em relação ao seu sexo: ")
			escreva ("\n(1) - Masculino\t\t(2)-Feminino\n")
			leia(sexo)
		}

		limpa()
		
		escolha(sexo){
			caso 1:
			se (idade>=30){
				salario2=salario1+100
				escreva ("NOME DO FUNCIONÁRIO: ",nome,".\t\tIDADE: ", idade,".\tSEXO: MASCULINO.\t  SALÁRIO FIXO: R$", salario1,"\n\n")
				escreva ("SALÁRIO FIXO + ABONO: R$", salario2,"\n")
			}
			senao {
				salario2=salario1+50
				escreva ("NOME DO FUNCIONÁRIO: ",nome,".\t\tIDADE: ", idade,".\tSEXO: MASCULINO.\t  SALÁRIO FIXO: R$", salario1,"\n\n")
				escreva ("SALÁRIO FIXO + ABONO: R$", salario2,"\n")
			}
			pare
			caso 2:
			se (idade>=30){
				salario2=salario1+200
				escreva ("NOME DA FUNCIONÁRIA: ",nome,".\t\tIDADE: ", idade,".\tSEXO: FEMININO.\t  SALÁRIO FIXO: R$", salario1,"\n\n")
				escreva ("SALÁRIO FIXO + ABONO: R$", salario2,"\n")
			}
			senao {
				salario2=salario1+80
				escreva ("NOME DA FUNCIONÁRIA: ",nome,".\t\t IDADE: ", idade,".\tSEXO: FEMININO.\t  SALÁRIO FIXO: R$", salario1,"\n\n")
				escreva ("SALÁRIO FIXO + ABONO: R$", salario2,"\n")
			}
			pare
			
			
		}
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 641; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */