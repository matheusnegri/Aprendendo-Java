package application;
import java.util.Locale;
import java.util.Scanner;


public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números?");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("Número %d:", i + 1);
			array[i] = sc.nextInt();
		}
		
		int auxiliar = 0;
		int cont = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				auxiliar += array[i];
				cont++;
			}
		}
		if(cont == 0) {
			System.out.println("Nenhum número par");	
		} else {
			float media = auxiliar / cont;
				
			System.out.printf("Média dos pares: %.1f%n", media);
		}
	}

}
