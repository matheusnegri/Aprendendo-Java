import java.util.Scanner;
import java.util.Locale;


public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o número:");
		int quantidade = sc.nextInt();
		
		for(int a = 0; a < quantidade; a++) {
			System.out.println("Qual o número?");
			numero = sc.nextInt();
			for (int i = 1; i <= numero; i++) { 
				if (numero % i == 0) {
					System.out.println(i);		
				}
			}
		}
		
		

	}

}
