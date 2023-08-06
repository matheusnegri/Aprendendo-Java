package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de produtos:");
		int n = sc.nextInt();
		
		//Instancia do objeto e criação do vetor
		Produto vetor[] = new Produto[n];
		
		String nome = null;
		double preco = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Produto %d:", i + 1);
			sc.nextLine();
			nome = sc.nextLine();
			System.out.printf("Preço %d:", i + 1);
			preco = sc.nextDouble();
			
			vetor[i] = new Produto(nome, preco);
		}
		
		double media = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i].mostraVetor();
			media += vetor[i].getPreco();
		}
		
		System.out.printf("Média de preço dos produtos: %.2f", media / vetor.length);

	}

}
