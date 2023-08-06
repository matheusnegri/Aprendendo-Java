package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados?");
		int n = sc.nextInt();
		
		String nomes[] = new String[n];
		float nota1[] = new float[n];
		float nota2[] = new float[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Nome: %d", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.printf("Nota: %d", i + 1);
			float n1 = sc.nextFloat();
			System.out.printf("Nota: %d", i + 2);
			float n2 = sc.nextFloat();
			
			nomes[i] = nome;
			nota1[i] = n1;
			nota2[i] = n2;
			
			System.out.println();
		}
		
		String nomeAprovados[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			if(((nota1[i] + nota2[i]) / 2) >= 6.00) {
				nomeAprovados[i] = nomes[i];
			}
		}
		
		System.out.println("Alunos aprovados");
		for(int i = 0; i < n; i++) {
			if(nomeAprovados[i] != null) {
				System.out.println(nomeAprovados[i]);
			}
		}
	}

}
