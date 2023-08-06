package application;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de números?");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Valor %d:", i + 1);
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("Resultado:");
		
		double sum = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			sum += vetor[i];
		}
		
		System.out.printf("Média: %.2f", sum / vetor.length);
		
		

	}

}
