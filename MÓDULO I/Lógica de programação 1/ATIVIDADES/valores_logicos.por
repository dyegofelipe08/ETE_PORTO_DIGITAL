programa
{
	
	funcao inicio()
	{
		inteiro a, b,c, d
		logico x, y, z, w, v
		
		escreva ("Digite o valor de A: ")
		leia (a)
		escreva ("Digite o valor de B: ")
		leia (b)
		escreva ("Digite o valor de C: ")
		leia (c)
		escreva ("Digite o valor de D: ")
		leia (d)
		limpa()

		escreva ("Vc digitou: A= ",a, ", B= ", b, ", C= ", c, " e D= ",d,"\n\n")

		x= ((a>b) e (c>d))
		y=((a<=b) e (c>10))
		z=((a<=b) ou ((c==d) e (d<a)))
		w=(a==b)ou(c==d)
		v=(((a==b) e (b<30)) ou (c>=d))

		escreva ("Primeira e segunda expresão: ",x, "\n")
		escreva ("Terceira expresão: ",y, "\n")
		escreva ("Quarta expresão: ",z, "\n")
		escreva ("Sexta expresão: ",v, "\n")
		
		
		
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */