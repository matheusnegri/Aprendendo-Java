import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, num_peca;
		float valor_unit_peca, soma;
		
		
		codigo = sc.nextInt();
		num_peca = sc.nextInt();
		valor_unit_peca = sc.nextFloat();
		
		soma = (float) num_peca * valor_unit_peca;	
		
		sc.nextLine();
		
		codigo = sc.nextInt();
		num_peca = sc.nextInt();
		valor_unit_peca = sc.nextFloat();
		
		System.out.printf("Valor a pagar R$: %.2f%n", soma + (num_peca * valor_unit_peca));

		
		sc.close();
	}

}
