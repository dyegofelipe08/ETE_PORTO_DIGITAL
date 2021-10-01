programa 
{	
	funcao imprime_linha(){
		
		escreva("\n*******************************\n")
		escreva("* Competição Anual de Natação *")
		escreva("\n*******************************\n\n") 
	}
	funcao inicio() 
	{
	   	inteiro id
		inteiro categoria = 0
	  	
	  	imprime_linha()
	  	escreva("informe sua Idade: ")
	  	leia(id)
	  	 
	   	 
	   	se(id >=5 e id <=7){
		categoria = 1
	   	
	   	}senao se(id >= 8 e id <=10){
		categoria = 2 
	   	
	   	}senao se(id>= 11 e id<=13){
		categoria = 3
	   
	  	}senao se(id >= 14 e id <=17){
		categoria = 4

	   	}senao se(id >= 18){
		categoria = 5

		/*
		 * sugestão da professora:
		 * se (id >= 18){
			categoria = 5
		}senao se (id >=14){
			categoria = 4
		}senao se (id >=11){
			categoria = 3
		}senao se (id >= 8){
			categoria = 2
		} senao se (id >= 5){
			categoria = 1
		}
		 */
	
	 
		 }

		 escolha(categoria){
	
		   	caso 1:
		   		escreva("Categoria: Infantil A")
		   	pare
	
		   	caso 2:
		   		escreva("Categoria: Infantil B")
		   	pare
	
		   	caso 3:
		   		escreva("Categoria: Juvenil A")
		   	pare
	
		   	caso 4:
		   		escreva("Categoria: Juvenil B")
		   	pare
		   	caso 5:
				escreva("Categoria: Adulto")
		   	pare
		   	caso contrario:
				escreva("Não pode competir")
		   	pare
		   }		
		   escreva("\n")  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */