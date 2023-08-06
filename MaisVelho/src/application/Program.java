package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos pessoas você vai digitar?");
		int n = sc.nextInt();
		
		Pessoa nomes[] = new Pessoa[n];
		Pessoa idades[] = new Pessoa[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Idade");
			int idade = sc.nextInt();
			
			nomes[i] = new Pessoa(nome);
			idades[i] = new Pessoa(idade);
		}
		
		int aux = 0;
		int posicao = 0;
			
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(idades[i].getIdade() > idades[j].getIdade() && idades[i].getIdade() > aux) {
					aux = idades[i].getIdade();
					posicao = i;
				}
			}
		}
		
		 
		System.out.printf("Idade: %d%n", aux);
		System.out.printf("Pessoa mais velha: %s%n", nomes[posicao].getNome());

	}

}
