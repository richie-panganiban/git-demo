package ph.com.bdo.demo;

public class Calculator {

	public void addAndPrintNumbers(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	public void multiplyAndPrintNumbers(int a, int b) {
		int product = a * b;
		System.out.println(product);
	}
	
	public void divideAndPrintNumbers(int a, int b) {
		int divide = a / b;
		System.out.println(divide);
	}
}
