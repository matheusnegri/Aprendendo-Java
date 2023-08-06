
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um valor:");
		numero = sc.nextInt();
		
		if (numero >= 1 && numero <= 1000) {
			for (int i = 0; i < numero; i++) { 
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		} else { 
			
			System.out.println("Número inválido, informe um valor de 1 até 1000");
		}
		
	sc.close();	
	}

}
