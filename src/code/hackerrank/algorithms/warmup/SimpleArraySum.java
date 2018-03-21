package code.hackerrank.algorithms.warmup;

import java.util.Scanner;

/*https://www.hackerrank.com/challenges/simple-array-sum/problem*/
public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			sum = sum + arr[arr_i];
		}
		System.out.println(sum);
	}
}
