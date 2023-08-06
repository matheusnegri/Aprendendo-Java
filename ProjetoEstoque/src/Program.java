import java.util.Locale;
import java.util.Scanner;

import entities.Produto;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Mostrar dados do produto");
			System.out.println("2 - Adicionar produto");
			System.out.println("3 - Remover estoque");
			System.out.println("4 - Adicionar estoque");
			System.out.println("5 - Mostrar valor total em estoque");
			System.out.println("6 - Sair");
			opcao = sc.nextInt();
			
			int quantidade = 0;
			
			if(opcao == 1) {
				produto.mostrarDadosProdutos();
			} else if (opcao ==2) {
				System.out.println("Produto:");
				produto.nome = sc.next();
				
				System.out.println("Quantidade:");
				produto.quantidade = sc.nextInt();
				
				System.out.println("Preço:");
				produto.preco = sc.nextDouble();
				
				produto.mostrarDadosProdutos();
			} else if (opcao == 3) {
				System.out.println("Quantidade");
				quantidade = sc.nextInt();
				produto.removerProdutosEstoque(quantidade);
				produto.mostrarDadosProdutos();
			} else if (opcao == 4) {
				System.out.println("Quantidade");
				quantidade = sc.nextInt();
				produto.adicionarProdutosEstoque(quantidade);
				produto.mostrarDadosProdutos();
			} else if (opcao == 5) {
				double valor = produto.totalValorEmEstoque();
				System.out.printf("Valor total do estoque: %.2f%n", valor);
			}
		} while (opcao != 6);
		
		sc.close();

	}

}
