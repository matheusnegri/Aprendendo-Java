import java.util.Scanner;
import java.util.Locale;


public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		System.out.println("Informe a senha:");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			System.out.println("Informe a senha novamente:");
			senha = sc.nextInt();
		} 
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
