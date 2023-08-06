import java.util.Scanner;
import java.util.Locale;


public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Informe um número");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
