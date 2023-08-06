package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			System.out.println("Quantos números serão informados?");
			n = sc.nextInt();
		} while(n > 10);
		
		int vetor[] = new int[n];
		int vetor_negativo[] = new int[n];
		
		int aux = 0;
		
		for(int a= 0; a < vetor.length; a++) {
			System.out.printf("Número %d:", a + 1);
			vetor[a] = sc.nextInt();
			
			if (vetor[a] < 0) {
				vetor_negativo[a] = vetor[a];  
			}
		}
		
		for (int b = 0; b < vetor_negativo.length; b++) {
			if(vetor_negativo[b] < 0) {
				System.out.println(vetor_negativo[b]);
			}	
		}


	}

}
