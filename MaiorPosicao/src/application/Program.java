package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		
		float maiorValor = 0;
		int posicao = 0;
		
		float vetor[] = new float[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Número %d", i + 1);
			vetor[i] = sc.nextFloat();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[i] > vetor[j] && vetor[i] > maiorValor) {
					maiorValor = vetor[i];
					posicao = i;
				}
			}
		}
		
		System.out.printf("Maior valor %.2f%n", maiorValor);
		System.out.printf("Posção%d", posicao);
	}

}
