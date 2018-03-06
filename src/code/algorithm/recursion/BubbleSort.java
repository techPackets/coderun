package code.algorithm.recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void runBubbleSort(int[] arr, int n, int arrLen) {

		if (n >= arrLen - 1)
			return;

		int i = n;

		for (int j = i + 1; j < arrLen; j++) {
			if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println("tail recursion" + Arrays.toString(arr));
		runBubbleSort(arr, n + 1, arrLen);
		System.out.println("head recursion" + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 1, 0, 8, 3, 11 };
		int n = 0;
		runBubbleSort(arr, n, arr.length);
	}
}
