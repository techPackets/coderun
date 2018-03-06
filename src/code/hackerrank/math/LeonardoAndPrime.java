package code.hackerrank.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*https://www.hackerrank.com/challenges/leonardo-and-prime/problem
*/
public class LeonardoAndPrime {

	public static boolean ifNumIsPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfInputs = Integer.parseInt(br.readLine());

		while (numOfInputs -- > 0) {
			int maxRange = Integer.parseInt(br.readLine());
			int productVal = 1;
			int k = 2;
			int numOfPrime = 0;

			if (maxRange == 1) {
				System.out.println(numOfPrime);
			} else {
				while ((productVal < maxRange)/* && (k < maxRange)*/) {
					if (LeonardoAndPrime.ifNumIsPrime(k)) {
						productVal = productVal * k;
						k++;
						numOfPrime++;
					}else {
						k++;
					}
				}
				System.out.println(numOfPrime);
			}
		}
	}

}
