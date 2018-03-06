package code.hackerrank.math;

import java.io.IOException;
import java.util.Scanner;

/*https://www.hackerrank.com/challenges/leonardo-and-prime/problem
*/
/*Alternative solution by taking hard coded primes upfront*/
public class LeonardoAndPrimeTwo {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
		while (q-- > 0) {
			long n = in.nextLong();
			int count = 0;
			long product = 1;
			for (int i : prime) {
				product *= i;
				if (product <= n) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
