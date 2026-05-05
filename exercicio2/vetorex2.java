package exercicio2;

import java.util.Scanner;

public class vetorex2 {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		int vetor [] = new int [5];
		int soma=0;
		
		vetor [0] = 10;
		vetor [1] = 20;
		vetor [2] = 30;
		vetor [3] = 40;
		vetor [4] = 50;
		
	
		System.out.println("a soma dos valores e ");
		for(int i = 0; i < vetor.length; i++) {
			 System.out.println(vetor[i]);
			soma+=vetor[i]; }
	
        
		System.out.println("o resultado da soma e");
		System.out.println(vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]);

	}

}
