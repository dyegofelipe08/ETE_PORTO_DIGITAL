
public class questãoExtraAt1 {

	public static void main(String[] args) {
		
		int matriz [][] = new int [4][4];
	
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length; j++) {
				matriz [i] [j] = i*j;
				if ((matriz [i][j]%2==0)) {
					matriz [i] [j] = i *0;
					matriz [i] [j] = j *0;
					

				}

				
				System.out.print(matriz [i][j] + " ");
			}
			
			System.out.println();
		}
	
		

	}

}
