import java.util.Locale;
import java.util.Scanner;


public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		
		double salario, imposto, auxiliar, auxiliar2, auxiliar3;
		
		System.out.println("Qual é o valor do seu salário?");
		salario = sc.nextDouble();
		
		
		if (salario <= 2000.00) {
			System.out.println("isento de impostos!");
		} else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = ((salario - 2000.00) * 0.08);
			System.out.printf("O imposto é: %.2f%n", imposto);
		} else if (salario > 3000.00 && salario <= 4500.00) {
			auxiliar = (salario - 2000.00);
			auxiliar2 = auxiliar - 1000.00;
			imposto = (auxiliar2 * 0.18) + 80.00;
			System.out.printf("O imposto é: %.2f%n", imposto);
		} else if (salario > 4500.00) {
			auxiliar = (salario - 2000.00); //isento
			auxiliar2 = auxiliar - 1000.00; //80
			auxiliar3 = (auxiliar2 - 1500.00); // 270
			imposto = (auxiliar3 * 0.28) + 80.00 + 270;
			
			System.out.printf("O imposto é de: %.2f%n", imposto);
		}
		}
}
