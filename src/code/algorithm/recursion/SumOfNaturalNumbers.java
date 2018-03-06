package code.algorithm.recursion;

public class SumOfNaturalNumbers {

	public static int sumOfNaturalNumbers(int range) {
		if (range < 1) {
			return range;
		}

		return range + sumOfNaturalNumbers(range - 1);
	}

	public static void main(String[] args) {
		int sum = sumOfNaturalNumbers(5);
		System.out.println("sum: " + sum);
	}

}
