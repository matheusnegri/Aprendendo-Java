package entities;

public class Produto {
	String nome;
	double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void mostraVetor() {
		System.out.println(this.nome);
		System.out.println(this.preco);
		System.out.println();
	}
}
