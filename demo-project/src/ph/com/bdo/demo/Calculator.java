package ph.com.bdo.demo;

import java.math.BigDecimal;

public class Calculator {

	BigDecimal result;

	public void addAndPrintNumbers(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}

	public void multiplyAndPrintNumbers(BigDecimal a, BigDecimal b) {

		result = a.multiply(b);
		System.out.println(result.toString());
	}

	public void divideAndPrintNumbers(int a, int b) {
		int divide = a / b;
		System.out.println(divide);
	}
}
