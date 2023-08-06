import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0, aux_in = 0;
		 
		System.out.println("Quantos números serão informados?");
		quantidade = sc.nextInt();
		
		for (int i= 0; i < quantidade; i++) {
			System.out.println("Número:");
			int numero = sc.nextInt();
			if(numero >= 10 && numero <= 20 ) {
				aux_in++;
			}
		}
		System.out.printf("Intervalo de 10 a 20: %d%n", aux_in);
		System.out.printf("Fora do intervalo de 10 a 20: %d%n", quantidade - aux_in);
	}

}
