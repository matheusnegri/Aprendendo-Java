import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, multiplo;
		
		System.out.println("Número 1:");
		numero1 = sc.nextInt();
		
		System.out.println("Número 2:");
		numero2 = sc.nextInt();
	
		if (numero1 >= numero2) {
			multiplo = numero1 % numero2;
		} else {
			multiplo = numero2 % numero1;
		}
		
		if (multiplo == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}

}
