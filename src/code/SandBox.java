package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SandBox {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());

		for (int i = 0; i < times; i++) {
			int block = Integer.parseInt(br.readLine());
			// int t = Integer.valueOf(times).intValue();
			// int block = Integer.valueOf(nthBlock).intValue();
			/*
			 * int initBlock = 0; int y = 1; int finalBlock = initBlock; boolean flag =
			 * false; int stepsTakenToReachFinalBlock = 0;
			 */

			/*
			 * for(int i=0;i<t;i++){ finalBlock = initBlock + y; y++; initBlock =
			 * finalBlock;
			 * 
			 * if(finalBlock == block){ flag = true; stepsTakenToReachFinalBlock = i; } }
			 */

			int num = (int) Math.sqrt((8 * block) + 1);
			if ((num * num) == ((8 * block) + 1)) {

				// Considering the equation n*(n+1)/2 = num
				// The equation is : a(n^2) + bn + c = 0";
				int c = (-2 * num);
				int b = 1, a = 1;
				int d = (b * b) - (4 * a * c);
				int root1 = (int) (-b + Math.sqrt(d)) / (2 * a);
				int root2 = (int) (-b - Math.sqrt(d)) / (2 * a);

				if (root1 > 0) {
					System.out.println("Go On Bob " + root1);
				} else if (root2 > 0) {
					System.out.println("Go On Bob " + root2);
				} 
				
			}else {
					System.out.println("Better Luck Next Time");
				}

				/*
				 * if(flag == true){ System.out.println("Go On Bob " +
				 * stepsTakenToReachFinalBlock); }
				 */
			}
		}
	}
