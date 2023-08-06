import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		String x1, x2, x3;
		
		x = sc.nextInt(); //aqui tem uma quebra de linha pendente
		sc.nextLine(); //fazendo quebra de linha para resolver a pendencia acima
		x1 = sc.nextLine();
		x2 = sc.nextLine();
		x3 = sc.nextLine();
		
		System.out.println(x); 
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		
		/*Exemplo sem quebra de linha*/
		
		int y;
		String y1, y2, y3;
		
		x = sc.nextInt();
		y1 = sc.nextLine();
		y2 = sc.nextLine();
	    y3 = sc.nextLine();
		
		System.out.println(x); //aqui tem uma quebra de linha pendente
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		sc.close();

	}

}
