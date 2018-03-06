package code.hackerrank.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem Statement: https://www.hackerrank.com/challenges/maximum-draws/problem*/
public class MaximumDraws {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());

		while (times-- > 0) {
			int numOfPairs = Integer.parseInt(br.readLine());
			System.out.println(numOfPairs + 1);
		}
	}
}
