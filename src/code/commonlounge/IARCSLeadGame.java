package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem: http://opc.iarcs.org.in/index.php/problems/LEADGAME*/

public class IARCSLeadGame {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfRounds = Integer.parseInt(br.readLine());
		int maxLead = Integer.MIN_VALUE;
		int leadingPlayer = 0;
		int sP1 = 0;
		int sP2 = 0;

		for (int i = 1; i <= numOfRounds; i++) {
			String[] scores = br.readLine().split(" ");
			sP1 += Integer.parseInt(scores[0]);
			sP2 += Integer.parseInt(scores[1]);

			int diff = Math.abs(sP1 - sP2);
			if (diff > maxLead) {
				maxLead = diff;
				leadingPlayer = (sP1 > sP2) ? 1 : 2;
			}
		}
		System.out.println(leadingPlayer + " " + maxLead);
	}
}
