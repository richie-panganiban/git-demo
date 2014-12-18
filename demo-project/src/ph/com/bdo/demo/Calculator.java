package ph.com.bdo.demo;

import java.math.BigDecimal;

public class Calculator {
	
	BigDecimal result;
	
	public int addAndPrintNumbers(int[] list) {
		 
	    int sum = 0;
	    for (int i=0; i < list.length; i++) {
	        sum += list[i];
	    }
	    return sum;
	 
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
