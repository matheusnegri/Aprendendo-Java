import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		int opcao = 0;
		
		do {
			System.out.println("Altura: ");
			aluno.height = sc.nextDouble();
			
			System.out.println("Largura: ");
			aluno.width = sc.nextDouble();
			
			System.out.println("1 - Calcular area");
			System.out.println("2 - Calcular perimetro");
			System.out.println("3 - Calcular diagonal");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
						
			double aux = 0;
			
			if(opcao == 1) {
				aux = aluno.calculoArea();
				System.out.printf("Área: %.2f%n", aux);
			} else if (opcao == 2) {
				aux = aluno.calculoPerimetro();	
				System.out.printf("Perímetro: %.2f:%n", aux);
			} else if (opcao == 3) {
				aux = aluno.calculoDiagonal();
				System.out.printf("Diagonal: %.2f:%n", aux);
			}
			
		
		} while(opcao != 0);
	}

}
