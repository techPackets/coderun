package code.algorithm.recursion;

public class Recursion {

	/* run head recursion */
	public static void runHeadRecursion(int n) {
		if (n < 1)
			return;
		runHeadRecursion(n - 1);
		System.out.println("head recursion: " + n);
	}

	/* run tail recursion */
	public static void runTailRecursion(int n) {
		if (n < 1)
			return;
		System.out.println("tail recursion: " + n);
		runTailRecursion(n - 1);
	}

	/* run multiple recursion */
	public static void runMultipleRecursion(int n) {
		if (n < 1)
			return;
		runMultipleRecursion(n - 1);
		System.out.println("multiple recursion first stack: " + n);
		runMultipleRecursion(n - 1);
		System.out.println("multiple recursion second stack: " + n);
	}

	/* Run the method n times */
	public static void runMethodNTimes(int times) {

		if (times <= 0) {
			return;
		} else {
			System.out.println("hello before: " + times);
			runMethodNTimes(times - 1);
			System.out.println("hello after: " + times);

		}
	}

	/* calculate factorial of a number */
	public static int runFactorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * runFactorial(number - 1);
		}
	}

	public static int findPow(int x, int y) {
		int val = 0;
		if (y == 0) {
			return val;
		}

		val = x * x;
		findPow(x, y - 1);
		System.out.println(val);

		return val;
	}

	public static void main(String[] args) {
		runMethodNTimes(5);
		int fact = runFactorial(3);
		System.out.println("factorial:" + fact);
		runHeadRecursion(5);
		runTailRecursion(6);
		runMultipleRecursion(3);
		// int result = findPow(2,5);
		// System.out.println(result);
	}
}
