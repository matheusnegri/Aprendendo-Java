package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados serão registrados?");
		int a = sc.nextInt();
		
		int id = 0;
		String nome;
		double salario;
	
		//Criando a lista com a classe funcionarios
		List<Funcionarios> lista = new ArrayList();
		
		for (int i = 0; i < a; i++) {
			System.out.println("ID");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome");
			nome = sc.next();
			System.out.println("Salário:");
			salario = sc.nextDouble();
			lista.add(new Funcionarios(id, nome, salario));
		}

		for (Funcionarios teste : lista) {
			teste.mostrarLista();
		}
		
		System.out.println("Qual funcionário você quer aumentar o salário?");
		int codigo = sc.nextInt();
		
		System.out.println("Quantos porcento?");
		double porcentagem = sc.nextDouble();
		
		Funcionarios cod = lista.stream().filter(x -> x.getId() == codigo).findFirst().orElse(null);
		
		if (cod == null) {
			System.out.println("Código não existe!");
		} else {
			cod.increaseSalary(porcentagem);
		}
		
		System.out.println();
		
		for (Funcionarios teste : lista) {
			teste.mostrarLista();
		}
	}

}
