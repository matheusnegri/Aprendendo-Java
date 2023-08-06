package entities;

public class Quarto {
	
	String nome = null;
	String email = null;
	
	public Quarto(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void mostrarVetor() {
		System.out.printf("Nome: %s ", this.nome);
		System.out.printf("Email: %s%n", this.email);
	}
}

