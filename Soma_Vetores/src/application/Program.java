package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números cada vetor?");
		int n = sc.nextInt();
		
		int vetor1[] = new int[n];
		int vetor2[] = new int[n];
		int vetor3[] = new int[n];
		
		System.out.println("Vetor 1");
		System.out.println();
		for(int i = 0; i < vetor1.length; i++) {
			System.out.printf("Valor %d:", i + 1);
			vetor1[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Vetor 2");
		System.out.println();
		for(int i = 0; i < vetor2.length; i++) {
			System.out.printf("Valor %d:", i + 1);
			vetor2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i]; 
		}
		
		System.out.println();
		System.out.println("Soma dos vetores");
		for(int i = 0; i < vetor3.length; i++) {
			System.out.printf("%d + %d = %d%n", vetor1[i], vetor2[i], vetor3[i]);
		}
	}

}
