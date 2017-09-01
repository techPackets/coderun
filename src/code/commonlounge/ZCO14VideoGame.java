package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem: https://www.codechef.com/ZCOPRAC/problems/ZCO14001*/

public class ZCO14VideoGame {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * The commands are encoded as follows: 1 : Move left 2 : Move right 3 : Pick up
		 * box 4 : Drop box 0 : Quit
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] stats1 = br.readLine().split(" ");
		String[] stats2 = br.readLine().split(" ");
		String[] stats3 = br.readLine().split(" ");

		int width = Integer.parseInt(stats1[0]);
		int maxHeight = Integer.parseInt(stats1[1]);
		int craneIndex = 0;
		int endIndex = stats2.length - 1;
		boolean isCraneHoldingTheBox = false;

		quit: for (int i = 0; i < stats3.length; i++) {
			int operation = Integer.parseInt(stats3[i]);
			switch (operation) {
			case 1:
				if (craneIndex > 0)
					craneIndex--;
				break;
			case 2:
				if (craneIndex < endIndex)
					craneIndex++;
				break;
			case 3:
				if ((Integer.parseInt(stats2[craneIndex]) > 0) && !isCraneHoldingTheBox) {
					int heightAfterPickUp = Integer.parseInt(stats2[craneIndex]) - 1;
					stats2[craneIndex] = String.valueOf(heightAfterPickUp);
					isCraneHoldingTheBox = true;
				}
				break;
			case 4:
				if ((Integer.parseInt(stats2[craneIndex]) < maxHeight) && isCraneHoldingTheBox) {
					int heightAfterDrop = Integer.parseInt(stats2[craneIndex]) + 1;
					stats2[craneIndex] = String.valueOf(heightAfterDrop);
					isCraneHoldingTheBox = false;
				}
				break;
			case 0:
				break quit;
			}
		}

		for (int i = 0; i < stats2.length; i++) {
			System.out.print(stats2[i] + " ");
		}
	}
}
