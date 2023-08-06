package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		double x = preco * quantidade;

		return x;
	}
		
	public void removerProdutosEstoque(int qtde_aux) {
		quantidade -= qtde_aux;
	}
	
	public void adicionarProdutosEstoque(int qtde_aux) {
		quantidade += qtde_aux;
	}
	
	public void mostrarDadosProdutos()  {
		System.out.printf("Nome: %s%n", nome);
		System.out.printf("Preço: %.2f%n", preco);
		System.out.printf("Quantidade: %d%n", quantidade);
		System.out.printf("Valor em estoque: %.2f%n", quantidade * preco);
		
	}
}
