package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos pessoas?");
		int n = sc.nextInt();
		
		Pessoa vetor[] = new Pessoa[n];
		
		float media = 0;
		float pessoasMenor = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Idade:");
			int idade = sc.nextInt();
			System.out.println("Altura:");
			float altura = sc.nextFloat();
			vetor[i] = new Pessoa(nome, idade, altura);
			media += vetor[i].getAltura();
		}
		
		for(int a = 0; a < vetor.length; a++) {
			if(vetor[a].getIdade() < 16) {
				pessoasMenor++;
			}	
		}
		
		System.out.printf("Média de altura: %.2f%n", media / n);
		System.out.println("Pessoas com menos de 16 anos: " + (pessoasMenor / n) * 100 + "%");
		for(int a = 0; a < vetor.length; a++) {
			if(vetor[a].getIdade() < 16) {
				 System.out.println(vetor[a].getNome());
			}	
		}
		
	}

}
