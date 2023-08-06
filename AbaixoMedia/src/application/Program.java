package application;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Quantos elementos vai ter o vetor?");
	int n = sc.nextInt();
	
	float soma = 0;
	
	float array[] = new float[n];
	
	for(int i = 0; i < array.length; i++) {
		System.out.printf("Número %d", i + 1);
		array[i] = sc.nextFloat();
		soma += array[i];
	}
	
	float media = soma / n;
	
	System.out.println();
	System.out.println("A média é: " + media);
	System.out.println();
	System.out.println("Elementos abaixo da média:");
	System.out.println();
	for(int i = 0; i < array.length; i++) {
		if((soma / n) > array[i]) {
			System.out.println(array[i]);
		}
	}
	}

}
