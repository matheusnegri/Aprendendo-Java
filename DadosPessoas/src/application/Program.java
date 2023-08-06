package application;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão informadas?");
		int n = sc.nextInt();
		
		float[] alturas = new float[n];
		char[] sexos = new char[n];
		int resultado = 0, soma = 0;
		float somaAltura = 0, aux = 0;
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Altura: ");
			float altura = sc.nextFloat();
			System.out.println("Sexo (M/F):");
			char sexo = sc.next().charAt(0);
			
			alturas[i] = altura;
			sexos[i] = sexo;
			System.out.println();
		}
		
		for(int i = 0; i < n; i ++) {
			for(int j = i + 1; j < n; j++) {
				if((alturas[i] > alturas[j]) && alturas[i] > aux) {
					aux = alturas[i];
				}
			}
		}
		
		float aux2 = alturas[0];
		
		for(int i = 0; i < n; i ++) {
			for(int j = i + 1; j < n; j++) {
				if((alturas[i] < alturas[j]) && alturas[i] <= aux2) {
					aux2 = alturas[i];
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(sexos[i] == 'F' || sexos[i] == 'f') {
				somaAltura += alturas[i];
				soma++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(sexos[i] == 'M' || sexos[i] == 'm') {
				resultado++;
			}
		}
		
		System.out.println("Maior altura: " + aux);
		System.out.println("Menor altura: " + aux2);
		System.out.printf("Média das alturas das mulheres: %.2f%n", somaAltura / soma);
		System.out.println("Número de homens: " + resultado);
	}

}
