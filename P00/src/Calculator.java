
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

	public int divide(int a, int b) throws ArithmeticException {
		try {
			return(a / b);
		} catch(ArithmeticException ae) {
			throw new ArithmeticException("Cannot divide by 0");
		}

	}
}
