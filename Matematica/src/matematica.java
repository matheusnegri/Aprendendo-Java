import java.util.Locale;
import java.util.Scanner;

public class matematica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,x1,x2,delta;
		System.out.println("Valor de A:");
		a = sc.nextDouble();
		System.out.println("Valor de B:");
		b = sc.nextDouble();
		System.out.println("Valor de C:");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);	
		
		System.out.printf("Delta = %.4f%n", delta);
		System.out.printf("Delta = %.4f%n", x1);
		System.out.printf("Delta = %.4f%n", x2);
		
		sc.close();
		
	}

}
