package code.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void runBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 1, 0, 8, 3, 11 };
		runBubbleSort(arr);
	}

}
