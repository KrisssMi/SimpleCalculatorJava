package by.minevich.SimpleCalculator;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}

	public int sqrt(int a) {
		return (int) Math.sqrt(a);
	}

	public int abs(int a) {
		return Math.abs(a);
	}

}
