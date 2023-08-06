package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do titular:");
		String nomeTitular = sc.nextLine();
		
		System.out.println("Informe o número da conta:");
		int numeroConta = sc.nextInt();
		
		System.out.println("Haverá depósito?");
		System.out.println("S - Sim?");
		System.out.println("N - Não?");
		char opcao = sc.next().charAt(0);
		
		Conta conta;
		
		if (opcao == 's' || opcao == 'S') {
			System.out.println("Informe o valor do depósito?");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		
		conta.mostrarDados();
		
		do {
		
		System.out.println("Deseja realizar alguma operação? S / N");
		System.out.println("S - Sim");
		System.out.println("N - Não");
		opcao = sc.next().charAt(0);
		
		if(opcao == 's' || opcao == 'S') {
			System.out.println("1 - Saque");
			System.out.println("2 - Depósito");
			System.out.println("3 - Alterar nome titular");
			int auxiliar = sc.nextInt();
			
			if (auxiliar == 1) {
				System.out.println("Valor do saque:");
				double valor = sc.nextDouble();
				conta.saque(valor);
			} else if (auxiliar == 2) {
				System.out.println("Valor do depósito:");
				double valor = sc.nextDouble();
				conta.deposito(valor);
			} else if (auxiliar == 3) {
				System.out.println("Qual o nome?");
				String nome = sc.next();
				conta.setNome(nome);
			}
		conta.mostrarDados();
		}
		} while(opcao != 'N' && opcao != 'n');
	
	sc.close();
	}

}
