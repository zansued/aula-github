package entidades;

public class Triangulo {
	public double a, b, c;

	public double getArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
