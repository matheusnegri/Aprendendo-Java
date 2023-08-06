import java.util.Locale;
import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Qual valor do raio?");
		raio = sc.nextDouble();
		
		System.out.printf("A área do círculo é: %.4f%n", (Math.PI  * (Math.pow(raio, 2.0))));
		System.out.printf("A área do círculo é: %.4f%n", (3.14159 * (Math.pow(raio, 2.0))));
		
		sc.close();
	}

}
