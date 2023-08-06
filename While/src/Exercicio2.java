import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Valor de X:");
		x = sc.nextInt();
		
		System.out.println("Valor de Y:");
		y = sc.nextInt();
		
			while (x != 0  && y != 0) {
				if (x > 0 && y > 0) {
					System.out.println("primeiro");
				} else if (x > 0 && y < 0) {
					System.out.println("quarto");
				} else if (x < 0 && y > 0) {
					System.out.println("segundo");
				} else {
					System.out.println("terceiro");
				}
				System.out.println("Valor de X:");
				x = sc.nextInt();
				
				System.out.println("Valor de Y:");
				y = sc.nextInt();
			}
		sc.close();
	}

}
