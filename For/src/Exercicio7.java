import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas?");
		int quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("%d %.2f %.2f%n", (i + 1), (Math.pow(i + 1, 2)), Math.pow(i + 1, 3));
		}
		
	}

}
