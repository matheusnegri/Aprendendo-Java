package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public void atualizaSalario(double porcentagem) {
		this.salarioBruto += this.salarioBruto * (porcentagem / 100);
	}
	public void mostrarDados() {
		System.out.printf("Funcionário: %s %n", this.nome);
		System.out.printf("Salário Bruto: R$ %.2f %n", this.salarioBruto);
		System.out.printf("Imposto: R$ %.2f %n", this.imposto);
		System.out.printf("Salário Líquido: R$ %.2f %n", this.salarioBruto - this.imposto);
		
	}
}
