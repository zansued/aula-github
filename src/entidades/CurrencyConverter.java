package entidades;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	public static double dollar, real;
	public static int quantity;

	public static double converter(double vdollar) {
		dollar = vdollar;
		real = (dollar * quantity);
		real += real * IOF;

		return real;
	}
}
