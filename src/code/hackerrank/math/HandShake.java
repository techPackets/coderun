package code.hackerrank.math;

import java.util.Scanner;

/*Problem Statement: https://www.hackerrank.com/challenges/handshake/problem
*/
public class HandShake {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int totalHandShakes = 0;
			int i = 1;

			while ((n - i) > 0) {
				totalHandShakes += n - i;
				i++;
			}

			System.out.println(totalHandShakes);
		}
	}

}
