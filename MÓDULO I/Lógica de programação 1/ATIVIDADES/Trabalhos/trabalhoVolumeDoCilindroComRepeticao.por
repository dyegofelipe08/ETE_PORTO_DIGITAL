programa
{
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real m, d, c, mili, da, h, k, dm, cm, mm, dam,hm,km
		inteiro opcao
		
		escreva("Digite um valor em metros para converter em outra unidade de medida: ")
		leia (m)
		limpa()
		escreva ("Em qual unidade de medida deseja converter?\n")
		escreva ("\n\t\tESCOLHA UMA DAS OPÇÕES ABAIXO: ")
		escreveLinha()
		escreva ("\n\t\t1 - DM\t 2 - CM\t 3 - MM\n")
		escreva ("\n\t\t4 - DA\t 5 - HM\t 6 - KM")
		escreveLinha()
		leia (opcao)

		enquanto ((opcao!=1) e (opcao!=2) e (opcao!=3) e (opcao!=4) e (opcao!=5) e (opcao!=6)){
			escreva ("Opção inválida. Tente novamente: ")
			escreva ("\n\t\tESCOLHA UMA DAS OPÇÕES ABAIXO: ")
			escreveLinha()
			escreva ("\n\t\t1 - DM\t 2 - CM\t 3 - MM\n")
			escreva ("\n\t\t4 - DA\t 5 - HM\t 6 - KM")
			escreveLinha()
			leia (opcao)
			
		}
		
		d=mat.potencia(10.0, 1.0)
		c=mat.potencia(10.0,2.0)
		mili=mat.potencia(10.0,3.0)
		da=mat.potencia(10.0, -1.0)
		h=mat.potencia(10.0, -2.0)
		k=mat.potencia(10.0, -3.0)
		
		dm=d*m
		cm=c*m
		mm=mili*m
		dam=da*m
		hm=h*m
		km=k*m
		


			escolha (opcao){
			caso 1:
			escreva ("\n",m, " metro(s) equivale a ", dm, " decímetro(s).\n")
			pare
			caso 2: 
			escreva ("\n",m, " metro(s) equivale a ", cm, " centímetro(s).\n")
			pare
			caso 3:
			escreva ("\n",m, " metro(s) equivale a ", mm, " milímetro(s).\n")
			pare
			caso 4:
			escreva ("\n",m, " metro(s) equivale a ", dam, " decâmetro(s).\n")
			pare
			caso 5:
			escreva ("\n",m, " metro(s) equivale a ", hm, " hectômetro(s).\n")
			pare
			caso 6:
			escreva ("\n",m, " metro(s) equivale a ", km, " quilômetro(s).\n")
			pare
			
			
		}
		
		
	}

	funcao escreveLinha(){
		escreva ("\n________________________________________________________\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1664; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */