package code.hackerrank.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*https://www.hackerrank.com/challenges/sherlock-and-divisors/problem
*/
public class SherlockAndDivisors {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfTestCases = Integer.parseInt(br.readLine());

		while (numOfTestCases-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int i = 2;
			int sqrtN = (int) Math.sqrt(n);
			int divisorsDivByTwo = 0;

			if (n == 1) {
				System.out.println(0);
			} else {
				while (i <= sqrtN) {
					if (n % i == 0) {
						if (i % 2 == 0) {
							divisorsDivByTwo++;
						}
						if (i != (n / i)) {
							if ((n / i) % 2 == 0) {
								divisorsDivByTwo++;
							}
						}
					}
					i++;
				}
				if(n%2==0) {
					divisorsDivByTwo++;
				}
				System.out.println(divisorsDivByTwo);
			}
		}
	}
}
