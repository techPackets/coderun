package code.commonlounge;

import java.util.Arrays;
import java.util.Scanner;

/*Problem Statement: https://www.codechef.com/ZCOPRAC/problems/ZCO16001
Accepted Solution*/ 

public class BookshelvesZCO16Approach3 {

	public static Scanner scn = new Scanner(System.in);
	 
	public static int max(int a, int b,int c){
		if(a>b && a>c) return a;
		else if(b>c)  return b; else return c;
	}
 
	public static int max(int x, int y){
		return x>y ? x : y;
	}
 
	
	public static int min(int x, int y){
		return x<y ? x : y;
	}
 
	public static int solve(int arr[], int brr[], int n, int k){
 
 
		int ans= brr[n-1]+arr[n-1];
		if(k==0) return ans;
 
		//Coding the k=1 case separately
		if(k==1) return min( min( max(arr[0],brr[n-2]), max(arr[n-2],brr[0]) )+arr[n-1], ans);
		
		
		for (int i=0;i<k;i++){
			
			int val1 = max(arr[i],brr[n-2-i]) + arr[n-1];
			int val2 = max(brr[i],arr[n-2-i]) + arr[n-1];
 
			
			if(val2<ans) ans = val2;
			else if (val1<ans)ans=val1;
		}
		return ans;
	}
	
 
	public static void main(String[] args) {
		int n = scn.nextInt();
		int k = scn.nextInt();
 
		int arr[] = new int[n];
		int brr[] = new int[n];
		
 
		for(int i=0;i<n;i++){
			arr[i]= scn.nextInt();
		}
		for (int i=0; i<n; i++) {
			brr[i]= scn.nextInt();
		}
 
		Arrays.sort(arr); Arrays.sort(brr);
		
		int ans;
		if(arr[n-1]>brr[n-1])
		ans = solve(arr, brr, n, k);
		else
		ans = solve(brr, arr, n, k);
 
		System.out.println(ans);
		
	}
}
