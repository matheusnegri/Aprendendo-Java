import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome do funcionário:");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salário Bruto:");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("Imposto / Taxa:");
		funcionario.imposto = sc.nextDouble();
		
		int opcao = 0;
		double porc;
		
		do {
			System.out.println("1 - Mostrar os dados");
			System.out.println("2 - Alterar salário ");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			if(opcao == 1) {
				funcionario.mostrarDados();
			} else if(opcao == 2) {
				System.out.println("Qual porcentagem de aumento / desconto?");
				porc = sc.nextDouble();
				funcionario.atualizaSalario(porc);
				funcionario.mostrarDados();
			} 
		} while(opcao != 0);
		
		
	}

}
