package entities;

public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome) {
			this.nome = nome;
		}
	
	public Pessoa(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostrarDados() {
		System.out.println(this.nome);
		System.out.println();
		System.out.println(this.idade);
	}
	
	}
