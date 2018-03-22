package code.hackerrank.algorithms.warmup;

import java.util.Scanner;

/*https://www.hackerrank.com/challenges/compare-the-triplets/problem*/
public class CompareTheTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		int aP = 0;
		int bP = 0;

		if (a0 > b0) {
			aP += 1;
		} else if (b0 > a0) {
			bP += 1;
		}

		if (a1 > b1) {
			aP += 1;
		} else if (b1 > a1) {
			bP += 1;
		}

		if (a2 > b2) {
			aP += 1;
		} else if (b2 > a2) {
			bP += 1;
		}

		System.out.println(aP + " " + bP);
	}
}
