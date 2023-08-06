package entities;

public class Aluno {
	public double width;
	public double height;
	
	public double calculoArea() {
		return (this.height * this.width);
	}
	
	public double calculoPerimetro() {
		return (this.height * 2) + (this.width * 2);
	}

	public double calculoDiagonal() {
		return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
	}
	
}
