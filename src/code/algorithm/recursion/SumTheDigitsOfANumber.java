package code.algorithm.recursion;

public class SumTheDigitsOfANumber {

	public static int sumTheDigitsOfANumber(int n, int sum) {

		if (n <= 0) {
			return sum;
		}

		sum += n % 10;
		n = n / 10;
		return sumTheDigitsOfANumber(n, sum);
	}

	public static void main(String[] args) {
		int sum = 0;
		System.out.println(sumTheDigitsOfANumber(158346, sum));
	}

}
