package exercicio3;

import java.util.Scanner;

public class vetor3 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int vetor[] = {10, 23, 28, 34, 57, 64};
	    
	    int maior = vetor[0];
	    for (int i = 0; i < 6; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
	        }
	    }

	    System.out.println("o maior numero e " + maior);
	}}