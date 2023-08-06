import java.util.Scanner;
import java.util.Locale;


public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		float  gasolina = 0, alcool = 0, diesel = 0, opcao = 0, aux = 0;
		float p_alcool = 0, p_gasolina = 0, p_diesel = 0, valor_alcool = 0, valor_gasolina = 0, valor_diesel = 0;
		float valor_total = 0;
		float aux_alcool = 0, aux_gasolina = 0, aux_diesel = 0;
		
		while (opcao != 4) {
			System.out.println("1 - Alcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Fim");
			opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("Quanto gastou no abastecimento de alcool?");
				valor_alcool = sc.nextFloat();
				aux_alcool += valor_alcool;
				valor_total += valor_alcool;
				alcool++;
				aux++;
			} else if (opcao == 2) {
				System.out.println("Quanto gastou no abastecimento de gasolina?");
				valor_gasolina = sc.nextFloat();
				aux_gasolina += valor_gasolina;
				valor_total += valor_gasolina;
				gasolina++;
				aux++;
			} else if (opcao == 3) {
				System.out.println("Quanto gastou no abastecimento de diesel?");
				valor_diesel = sc.nextFloat();
				aux_diesel += valor_diesel;
				valor_total += valor_diesel;
				diesel++;
				aux++;
			} else if (opcao != 4) {
				System.out.println("Código inválido");
			}
		}
		p_alcool = (alcool /aux) * 100;
		p_gasolina = (gasolina /aux) * 100;
		p_diesel = (diesel /aux) * 100;
		System.out.println("Muito Obrigado!");
		System.out.println("___________________________________________________");
		System.out.println("Consumo total em quantidades e porcentagem:!");
		System.out.printf("Quantidade de Alcool:   %.2f - Porcentagem: %.2f%n", alcool, p_alcool);
		System.out.printf("Quantidade de Gasolina: %.2f - Porcentagem: %.2f%n", gasolina, p_gasolina);
		System.out.printf("Quantidade de Diesel:   %.2f - Porcentagem: %.2f%n", diesel,  p_diesel);
		
		System.out.println("___________________________________________________");
		System.out.println("Valores de cada combustível e porcentagem");
		System.out.printf("Total gasto com todos combustíveis R$ %.2f%n", valor_total);
		System.out.printf("Valores de alcool:   R$ %.2f - Porcentagem: %.2f", aux_alcool, (aux_alcool / valor_total) * 100);
		System.out.println();
		System.out.printf("Valores de gasolina: R$ %.2f - Porcentagem: %.2f", aux_gasolina, (aux_gasolina / valor_total) * 100);
		System.out.println();
		System.out.printf("Valores de diesel:   R$ %.2f - Porcentagem: %.2f", aux_diesel,  (aux_diesel / valor_total) * 100);
	}

}
