package ph.com.bdo.demo;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

        int sum = calculator.addAndPrintNumbers(new int[] {1,2,3});
        System.out.println(sum);
        
		calculator.multiplyAndPrintNumbers(new BigDecimal("1.1"),new BigDecimal("2.3"));
		calculator.divideAndPrintNumbers(10, 10);
	}
}
