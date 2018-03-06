package code.hackerrank.math;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class SummingTheNSeries {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			BigInteger n = in.nextBigInteger();
			System.out.println(n.multiply(n).mod(new BigInteger("1000000007")));
		}
	}
}
