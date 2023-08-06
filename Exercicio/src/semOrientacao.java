import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class semOrientacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Valores do triângulo 1:");
		x.a = sc.nextFloat();
		x.b = sc.nextFloat();
		x.c = sc.nextFloat();
		
		double a1 = x.calcularArea();
		
		System.out.println("Valores do triângulo 2:");
		y.a = sc.nextFloat();
		y.b = sc.nextFloat();
		y.c = sc.nextFloat();

		double a2 = y.calcularArea();
		
		Triangulo.resultado(a1);
		Triangulo.resultado(a2);
		Triangulo.verificaMaior(a1, a2);

	}
	
	

}
