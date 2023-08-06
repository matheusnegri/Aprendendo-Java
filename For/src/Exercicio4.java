import java.util.Locale;
import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int quantidade = 0;
		float n1 = 0, n2 = 0;
		
		
		System.out.println("Quantos médias serão calculadas?");
		quantidade = sc.nextInt();
		
		for (int i = 0; i < quantidade; i ++) { 
			System.out.println("Número 1:");
			n1 = sc.nextFloat();
			
			System.out.println("Número 2:");
			n2 = sc.nextFloat();
			
			if (n2 == 0) { 
				System.out.println("Divisão impossível");
			} else {
				System.out.println(n1 / n2);
			}	
		}
		
		sc.close();
	}

}
