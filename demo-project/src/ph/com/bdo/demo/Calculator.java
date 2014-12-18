package ph.com.bdo.demo;

import java.math.BigDecimal;

public class Calculator {
	private BigDecimal amountOne;
	private BigDecimal amountTwo;
	private BigDecimal amountThree;

	public void addAndPrintNumbers(int x, int y, int z) {
		amountOne = new BigDecimal(x);
		amountTwo = new BigDecimal(y);
		amountThree = new BigDecimal(z);
		System.out.println(amountOne.add(amountTwo.add(amountThree)));
	}

	public void multiplyAndPrintNumbers(int a, int b) {
		amountOne = new BigDecimal(a);
		amountTwo = new BigDecimal(b);
		System.out.println(amountOne.multiply(amountTwo));
	}

	public void divideAndPrintNumbers(int a, int b) {
		amountOne = new BigDecimal(a);
		amountTwo = new BigDecimal(b);
		System.out.println(amountOne.divide(amountTwo));
	}
}
