package VetorBidimensional;
import java.util.Scanner;


public class MatrizBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int [][] matriz = new int[4][4];
		Scanner entrada = new Scanner(System.in);
		System.out.print("\n Matriz M[4][4] \n");
		
		for(int linha = 0; linha < 4; linha ++) {
		  for(int coluna = 0; coluna < 4; coluna ++) {
			  System.out.printf("Insira o elementro M[%d][%d]: ", linha+1, coluna+1);
			   matriz[linha][coluna] = entrada.nextInt();
			   
		  }
		}
			System.out.print("\n Matriz ficou: \n");
			/**
			for (int linha = 0; linha < 4; linha ++) {
				for (int coluna = 0; coluna < 4; coluna ++) {
					if(linha == coluna) {
						soma = soma + matriz[linha][coluna];
					System.out.printf("\t %d \t ", matriz[linha][coluna]);
					System.out.print("A soma dos numeros diagonais pela direita é: " + soma);
					}
				}
				System.out.println();
			}
			**/
			
			for(int linha = 3; linha >= 0; linha --) {
				
					System.out.print(matriz[linha]);
			}	
				System.out.println();
				
	}

}
