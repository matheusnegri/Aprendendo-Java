package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a cotação do dólar?");
		double cotacao = sc.nextDouble();
		
		System.out.println("Quantos dólares vai comprar?");
		double valor = sc.nextDouble();
		
		double resultado = CurrencyConverter.Converter(cotacao, valor);
		
		System.out.println(resultado);
	}

}
