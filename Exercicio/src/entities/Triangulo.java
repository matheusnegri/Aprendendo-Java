package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public static void verificaMaior(double x, double y) {
		if (x > y) {
			System.out.println("Maior área é o triângulo 1");
		} else {
			System.out.println("Maior área é o triângulo 2");
		}

	}
	
	public double calcularArea() {
		double y = (a+b+c) / 2;
		double x = Math.sqrt(y * ((y - a) * (y - b) * (y - c)));
		
		return x;
	}
	
	public static void resultado(double resultado){
		System.out.printf("Área: %.4f%n", resultado);
	}
}

