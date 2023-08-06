package entities;

public class Funcionarios {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void increaseSalary(double porcentagem) {
		this.salario += (this.salario * porcentagem) / 100;
	}
	
	public void mostrarLista() {
		System.out.printf("ID: %d%n", this.id);
		System.out.printf("Nome: %s%n", this.nome);
		System.out.printf("Salário: %.2f%n%n", this.salario);
	}
}
