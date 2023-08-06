import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor, area;
		
		System.out.println("Largura:");
		largura = sc.nextDouble();
		System.out.println("Comprimento:");
		comprimento = sc.nextDouble();
		
		area = largura * comprimento;
		
		System.out.println("Qual o valor do metro quadrado?");
		valor = sc.nextDouble();
		
		//Valor do terreno
		System.out.printf("O valor do terreno é R$: %.2f%n", valor * area);
		
		sc.close();
		
	}

}
