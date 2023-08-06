import java.util.Scanner;
import java.util.Locale;


public class Exercicio4 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int hora_inicio, hora_final, resultado, auxiliar;
		
		System.out.println("Início do jogo?");
		hora_inicio = sc.nextInt();
		
		System.out.println("Final do jogo?");
		hora_final = sc.nextInt();
		
		if (hora_inicio == hora_final) {
			System.out.println("O jogo durou 24 horas");
		} else {
			if (hora_inicio >= hora_final) {
				auxiliar = (Math.abs (hora_inicio - 24)); 
				resultado = auxiliar + hora_final;
				System.out.printf("O jogo durou %d hora(s)%n", resultado);
			} else {
				resultado = hora_final - hora_inicio;
				System.out.printf("O jogo durou %d hora(s)%n", resultado);
			}
		}
	}

}
