package vetores;

import java.util.Scanner;

// 4 - Faça  um  Programa que  leia  um   vetor  de  10   caracteres,  
//	   e  diga  quantas   consoantes foram lidas. Imprima as consoantes. 

public class q4 {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("introduza a letra:"); 
		   Scanner scan = new Scanner(System.in); 
		   
		   String palavra = scan.next();
		   for(int i = 0; i < 10; i++) {
			   char c = palavra.charAt(i);			   
			   System.out.println(palavra);
			   switch(c){ 
				   case'a': 
				   case'e': 
				   case'i': 
				   case'o': 
				   case'u': System.out.println(); break;
				   default: count++; 
			   }
		   }
		   
		   
		
		
		
	}

}
