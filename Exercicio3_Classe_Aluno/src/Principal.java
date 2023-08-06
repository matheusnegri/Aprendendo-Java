import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome:");
		aluno.nome = sc.nextLine();	
		
		System.out.println("Nota 1:");
		aluno.nota1 = sc.nextDouble();
		
		if(aluno.nota1 < 0 || aluno.nota1 > 30) {
			while(aluno.nota1 < 0 || aluno.nota1 > 30) {
				System.out.println("Nota 1 só pode ter valor de 0 a 30 ");
				System.out.println("Informe a nota 1 novamente");
				aluno.nota1  = sc.nextDouble();
			}
		}
		
		System.out.println("Nota 2:");
		aluno.nota2 = sc.nextDouble();
		
		if(aluno.nota2 < 0 || aluno.nota2 > 35) {
			while(aluno.nota2 < 0 || aluno.nota2 > 35) {
				System.out.println("Nota 1 só pode ter valor de 0 a 30 ");
				System.out.println("Informe a nota 2 novamente");
				aluno.nota2 = sc.nextDouble();
			}
		}
		System.out.println("Nota 3:");
		aluno.nota3 = sc.nextDouble();
		
		if(aluno.nota3 < 0 || aluno.nota3 > 35) {
			while(aluno.nota3 < 0 || aluno.nota3 > 35) {
				System.out.println("Nota 1 só pode ter valor de 0 a 30 ");
				System.out.println("Informe a nota 3 novamente");
				aluno.nota3 = sc.nextDouble();
			}
		}

		aluno.calculaNota();
		aluno.verificaSituacao();
	}

}
