package by.minevich.SimpleCalculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(3, 3);
		if (result != 6) {
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.minus(8, 8));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.divide(8, 4));
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(7, calculator.multiply(9, 1));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calculator calculator = new Calculator();
		calculator.divide(3, 0);
	}

	@Test
	public void testPow() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(8, calculator.pow(2, 4));
	}

	@Test
	public void testSqrt() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.sqrt(4));
	}

	@Test
	public void testAbs() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.abs(-2));
	}
}
