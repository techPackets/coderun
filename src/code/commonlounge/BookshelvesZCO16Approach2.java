package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BookshelvesZCO16Approach2 {

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		int[] n1 = new int[n];
		int[] n2 = new int[n];
		int[] n3 = new int[n];
		int[] n4 = new int[n];
		
		for (int i = 2, j = 0; i < n + 2; i++, j++) {
			n1[j] = Integer.parseInt(input[i]);
		}

		for (int i = n + 2, j = 0; i < input.length; i++, j++) {
			n2[j] = Integer.parseInt(input[i]);
		}
		
		n3 = Arrays.copyOf(n1, n1.length);
		n4 = Arrays.copyOf(n2, n2.length);
				
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		System.out.println(Arrays.toString(n4));
		
		Arrays.sort(n1);
		Arrays.sort(n2);
		Arrays.sort(n3);
		Arrays.sort(n4);
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		 
		int initialSkew = n1[n - 1] + n2[n - 1];
		int skewCase1 = Integer.MIN_VALUE;
		int skewCase2 = Integer.MIN_VALUE;
		int[] skewCase1Arr = new int[k];
		int[] skewCase2Arr = new int[k];
		int ptrUpCase1 = n1.length-1;
		int ptrDownCase1 = 0;
		int ptrUpCase2 = n2.length -1;
		int ptrDownCase2 = 0;
		int index1 =0;
		int index2 =0;
		
		for(int i=0;i<k;i++) {
		 //Moving books from the above shelf to the below shelf
		  if(n1[ptrUpCase1] > n2[ptrDownCase1]) {
			  swap(n1[ptrUpCase1], n2[ptrDownCase1]);
			  ptrUpCase1 -- ;
			  ptrDownCase1 ++;
			  if(n1[n-1] > n2[n-1]) {
			  skewCase1Arr[index1] = n1[ptrUpCase1] + n2[0];
			  }else if(n1[n-1] < n2[n-1]) {
				  skewCase1Arr[index1] = n1[ptrUpCase1] + n2[n-1];	  
			  }
			  index1++;
		  }
		 }

		for(int i=0;i<k;i++) {
		//Moving books from the below shelf to the above shelf
			 if(n3[ptrUpCase2] > n4[ptrDownCase2]) {
				  swap(n3[ptrUpCase2], n4[ptrDownCase2]);
				  ptrUpCase2 -- ;
				  ptrDownCase2 ++;
				  if(n3[n-1] > n4[n-1]) {
					skewCase1Arr[index2] = n3[n-1] + n4[ptrDownCase2];
				  }else if(n3[n-1] < n4[n-1]) {
					skewCase1Arr[index2] = n3[0] + n4[ptrDownCase2];	  
				  }
				  index2++;
			  } 
		}
		
		System.out.println(Arrays.toString(skewCase1Arr));
		System.out.println(Arrays.toString(skewCase2Arr));
	}
}
