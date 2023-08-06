package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void calculaNota() {
		System.out.printf("Aluno: %s%n", this.nome);
		System.out.printf("Nota 1: %.2f%n", this.nota1);
		System.out.printf("Nota 2: %.2f%n", this.nota2);
		System.out.printf("Nota 3: %.2f%n", this.nota3);
		System.out.println();
		System.out.printf("Média: %.2f%n", this.nota1 + this.nota2 + this.nota3);
	}
	
	public void verificaSituacao() {
		if (this.nota1 + this.nota2 + this.nota3 >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", 60 - (this.nota1 + this.nota2 + this.nota3));
		}
	}
}
