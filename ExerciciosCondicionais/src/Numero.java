import java.util.Scanner;
import java.util.Locale;


public class Numero {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o número:");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
