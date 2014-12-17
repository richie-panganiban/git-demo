package ph.com.bdo.demo;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addAndPrintNumbers(1, 1, 1);
		calculator.multiplyAndPrintNumbers(new BigDecimal("1.1"),new BigDecimal("2.3"));
		calculator.divideAndPrintNumbers(10, 10);
	}
}
