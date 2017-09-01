package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Problem Statement: https://www.codechef.com/ZCOPRAC/problems/ZCO16001
Initial draft, some of the test cases are failing
Approach:

Sorted both array
Take two pointers, one start with the end of one array the other
from the beginning of the second array
If arr[ptr1] > arr[ptr2] 
swap
In the end check the array for the max element 
take the max element & the arr[pointer] of the other array

Fundamentally I've taken a two pointer approach.
*/
public class BookshelvesZCO16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		int[] n1 = new int[n];
		int[] n2 = new int[n];
		
		for(int i=2,j=0;i<n+2;i++,j++) {
		  n1[j] = Integer.parseInt(input[i]);
		}
		
		for(int i=n+2,j=0;i<input.length;i++,j++) {
			  n2[j] = Integer.parseInt(input[i]);
		}
		
		/*System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));*/
		
		Arrays.sort(n1);
		Arrays.sort(n2);
		
		/*System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));*/
		
		int shelf1Ptr = n1.length-1;
		int shelf2Ptr = 0;
		
		int skew = n1[n-1] + n2[n-1];
		//System.out.println("default skew: "+ skew);
		
		for(int i=0;i<k;i++) {
			if(n1[shelf1Ptr] > n2[shelf2Ptr]) {
				int temp = n1[shelf1Ptr];
				n1[shelf1Ptr] = n2[shelf2Ptr];
				n2[shelf2Ptr] = temp;
				shelf1Ptr--;
				shelf2Ptr++;
			}
		}
		
		if(n1[n-1] > n2[n-1]){
			skew = n1[shelf1Ptr] + n2[0];
		}else if(n1[n-1] < n2[n-1]) {
			skew = n1[shelf1Ptr] + n2[n-1];
		}
		
		System.out.println(skew);
	}
}
