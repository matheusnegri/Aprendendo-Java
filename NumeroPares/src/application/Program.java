package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		
		int quantidadePar = 0;
		
		int vetor[] = new int[n];	
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Valor %d:", i + 1);
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 == 0) {
				quantidadePar++;
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
			}
		}
		
		System.out.printf("Quantidade de pares: %d", quantidadePar);

	}

}
