package Entidades;

public class Calc {

	public double larg, alt;

	public double area() {
		return larg * alt;
	}

	public double peri() {
		return 2 * (larg + alt);
	}

	public double diag() {
		return Math.sqrt((larg * larg) + (alt * alt));
	}
}
