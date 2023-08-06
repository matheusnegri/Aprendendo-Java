package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int n = sc.nextInt();
		
		Quarto vetor[] = new Quarto[10];
		
		String nome;
		String email;
		int quarto = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nome:");
			nome = sc.next();
			System.out.println("Email");
			email = sc.next();
			System.out.println("Quarto");
			quarto = sc.nextInt();
			
			vetor[quarto] = new Quarto(nome, email);
		}
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.printf("Quarto %d - ", i, " ");
				vetor[i].mostrarVetor();
			}
		}

	}

}
