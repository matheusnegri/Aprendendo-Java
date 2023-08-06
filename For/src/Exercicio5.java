import java.util.Scanner;
import java.util.Locale;


public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		int fatorial = 1;
		
		System.out.println("Quantos números?");
		quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) { 
			System.out.printf("Número %d%n", i + 1);
			System.out.println("Qual número deseja calcular o fatorial?");
			int numero = sc.nextInt();
			int auxiliar = numero;
			for (int a = numero; a > 0; a--) {
				fatorial = fatorial * numero;
				numero--;
			}
			System.out.printf("Fatorial do número %d é %d%n", auxiliar, fatorial);
			fatorial = 1;
		}
		
		sc.close();

	}

}
