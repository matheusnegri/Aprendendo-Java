import java.util.Locale;
import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Eixo x:");
		x = sc.nextDouble();
		System.out.println("Eixo y:");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else {
			if (x > 0) {
				if (y > 0) {
					System.out.println("Quandrante 1");
				} else {
					System.out.println("Quandrante 4");
				}
			} else if (x < 0) {
				if (y > 0) { 
					System.out.println("Quandrante 2");
				} else {
					System.out.println("Quandrante 3");
				}
			} 
		}
		
		
		sc.close();
		 
	}

}
