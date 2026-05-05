package exercicio4;

import java.util.Scanner;

public class vetor4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);


		    int vetor[] = {10, 23, 28, 34, 57, 64,72,83};
		    int resultado = 0;
		 
		    
		    for(int i = 0; i < vetor.length; i++) {
		    if (vetor[i] %2 ==0) {
		    	
		    	resultado++;
		    }
	}
            System.out.println("quantidade de numeros pares?"+ resultado);
}
}