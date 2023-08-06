import java.util.Locale;
import java.util.Scanner;


public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		short codigo;
		float hora, valor;
		
		System.out.println("Qual seu código (1 a 100) ? ");
		codigo = sc.nextShort();
		
		System.out.println("Quanto ganha por hora? ");
		valor = sc.nextFloat();
		
		System.out.println("Quants horas trabalhada? ");
		hora = sc.nextFloat();
		
		System.out.printf("Número = %d%n", codigo);
		System.out.printf("Seu salário é R$ : %.2f%n", valor * hora);
		
		sc.close();
		
	}

}
