programa
{	
	inclua biblioteca Tipos --> tip
	funcao inicio()
	{
		//declaração de variáveis
		cadeia hora
		logico valida_hora
		inteiro hora_inteiro
		//entrada de dados		
		escreva("Digite uma hora inteira: ")
		leia(hora)
		//processamento de dados
		valida_hora = tip.cadeia_e_inteiro(hora, 10)
		
		escreva("\n")
		
						
		se(valida_hora == falso){
				escreva("hora inválida! \n")					
		}

		senao {
			
			hora_inteiro = tip.cadeia_para_inteiro(hora, 10)
		
		
		
		se ((hora_inteiro<12) e (hora_inteiro>=6)){
			escreva("Bom dia!\n")
		}	
		senao se ((hora_inteiro>=12) e (hora_inteiro<18)){
			escreva ("Boa tarde!\n")			
		}
		senao {
			escreva ("Boa noite!\n")
		}
		}
	}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */