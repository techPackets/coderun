package code.hackerrank.algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Long sum = 0L;
		Long arr[] = new Long[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = Long.valueOf(in.nextInt());
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(sum);
	}
}
