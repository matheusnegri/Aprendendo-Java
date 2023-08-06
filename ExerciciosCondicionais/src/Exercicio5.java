import java.util.Scanner;
import java.util.Locale;


public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valor;
		
		
		System.out.println("Código | Especificação | Preço ");
		System.out.println("1 | Cachorro Quente | R$ 4,00 ");
		System.out.println("2 | X-Salada        | R$ 4,50 ");
		System.out.println("3 | X-Bacon         | R$ 5,00 ");
		System.out.println("4 | Torrada Simples | R$ 2,00 ");
		System.out.println("5 | Refrigerante    | R$ 1,50 ");
		 
		System.out.println("Qual é o código do cardápio?");
		codigo = sc.nextInt();
		
		if(codigo <= 0 || codigo > 5) {
			System.out.println("Código inválido!");
		} else {
			System.out.println("Qual é a quantidade?");
			quantidade = sc.nextInt();
			
			switch (codigo) {
			case 1:
				valor = quantidade * 4;
				System.out.printf("Valor total: %.2f%n", valor); 
				break;
			case 2:
				valor = quantidade * 4.50;
				System.out.printf("Valor total: %.2f%n", valor); 
				break;
			case 3:
				valor = quantidade * 5.00;
				System.out.printf("Valor total: %.2f%n", valor); 
				break;
			case 4:
				valor = quantidade * 2.00;
				System.out.printf("Valor total: %.2f%n", valor); 
				break;
			case 5:
				valor = quantidade * 1.50;
				System.out.printf("Valor total: %.2f%n", valor); 
				break;
			}
		}
		
		
		sc.close();
	}

}
