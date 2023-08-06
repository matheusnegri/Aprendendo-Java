package entities;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double Valor;
	
	public Conta() {	
	}

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public void setNome(String nome) {
		this.nomeTitular = nome;
	}
	
	public String getNome() {
		return this.nomeTitular;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	
	public double getDepositoInicial() {
		return this.Valor;
	}
	
	public void deposito(double valor) {
		this.Valor += valor;
	}
	
	public void saque(double valor) {
		this.Valor -= (valor + 5.00);
	}
	
	public void mostrarDados() {
		System.out.printf("Titular: %s%n", this.getNome());
		System.out.printf("Número da conta: %d%n", this.getNumeroConta());
		System.out.printf("Valor: %.2f%n", this.getDepositoInicial());
		System.out.printf("__________________________________________________%n");
	}
}
