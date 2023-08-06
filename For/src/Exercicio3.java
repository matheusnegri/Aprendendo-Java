import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade = 0;
		
		float media = 0, v1 = 0, v2 = 0, v3 = 0;
		
		System.out.println("Quantos números serão lidos?");
		quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Número 1:");
			v1 = sc.nextFloat();
			System.out.printf("Número 2:");
			v2 = sc.nextFloat();
			System.out.printf("Número 3:");
			v3 = sc.nextFloat();
			media = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
			System.out.printf("Média: %.2f", media);
			System.out.println();
		}
		
		sc.close();
	}
}
