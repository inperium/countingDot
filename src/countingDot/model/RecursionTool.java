package countingDot.model;

public class RecursionTool {

	public int calculateFactorial(int currentNumber) {
		if (currentNumber == 0 || currentNumber == 1) {
			return 1;
		} else {
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}

	public int calculateFibonacci(int currentNumber) {
		if (currentNumber == 0 || currentNumber == 1) {
			return 1;
		} else {
			return calculateFactorial(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}

	public int fibonacciIteration(int number) {
			int a = 0;
			int b = 1;
			int c = 0;
			for (int i = 0; i < number; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
	}
}