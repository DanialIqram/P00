
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b == 0) { 
			throw new IllegalArgumentException("Number cannot be divided by 0"); 
		} else {
			return a / b;
		}
	}
}
