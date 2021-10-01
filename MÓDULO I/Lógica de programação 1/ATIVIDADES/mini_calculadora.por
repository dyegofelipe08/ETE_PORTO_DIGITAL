programa
{
	
	funcao inicio()
	{
		inteiro calc
		real n1,n2

		escreva ("Olá! Digite um número inteiro para realizarmos uma operação aritimética para você: ")
		leia (n1)
		escreva ("\nOlá! deseja realizar qual operação abaixo: \n")
		escreva (" 1. SOMA\t 2. SUBTRAÇÃO\t 3.MULTIPLICAÇÃO\t 4. DIVISÃO\n")
		escreva ("\nDigite o número referente à operação a qual deseja realizar: \n")
		leia (calc)
		escreva ("\nDigite o segundo número inteiro para realizarmos a operação que vc optou: ")
		leia (n2)

		escolha (calc){
			caso 1:
			escreva ("Sua operação é: ", n1, " + ", n2, " = ", n1+n2, "\n")
			pare
			caso 2:
			escreva ("Sua operação é: ", n1, " - ", n2, " = ", n1-n2, "\n")
			pare
			caso 3: 
			escreva("Sua operação é: ", n1, " x ", n2, " = ", n1*n2, "\n")
			pare
			caso 4:
			escreva ("Sua operação é: ", n1, " / ", n2, " = ", n1/n2, "\n")
			pare
			caso contrario :
			escreva ("\nOPÇÃO INVÁLIDA\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */