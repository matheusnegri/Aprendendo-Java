import java.util.Locale;
import java.util.Scanner;


public class aprendendoCriarFuncoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 2 números");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int resultado = teste(a, b);
		
		mostraResultado(resultado);
		
		System.out.println("Informe um número:");
		int u = sc.nextInt();
		
		informa(u);
		
		
		
	}
	
	//Função para encontrar o número maior
	public static int teste(int x, int y) {
		
		int aux = 0;
		
		if (x > y) {
			aux = x;
		} else if (y > x) {
			aux = y;
		}
	
		return aux;
	}
	
	//Função para exibir o resultado
	public static void mostraResultado(int res) {
		System.out.printf("O maior é: %d", res);
	}
	
	//Função para mostrar se o número é impar ou não
	public static void informa(int c) {
		if (c % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		

	}

}
