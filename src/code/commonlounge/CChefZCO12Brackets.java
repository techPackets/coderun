package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem Statement: https://www.codechef.com/ZCOPRAC/problems/ZCO12001*/
/*Solution not 100% correct. Will fail for this scenario (()(()))
Will solve it using stacks*/

public class CChefZCO12Brackets {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		boolean isCloseBracketExpected = false;
		int pos = -1;
		int openingBrackets = 0;
		int nestedLevel = 0;
		int maxNestedLevel = Integer.MIN_VALUE;
		String[] inputString = br.readLine().split(" ");

		for (int i = 1; i <= length; i++) {
			int input = Integer.parseInt(inputString[i-1]);

			if (input == 1 && !isCloseBracketExpected) {
				openingBrackets += 1;
			} else if (input == 2) {
				nestedLevel += 1;

				if (openingBrackets == nestedLevel) {
					if (nestedLevel > maxNestedLevel) {
						maxNestedLevel = nestedLevel;
						pos = i - openingBrackets;
					}
					openingBrackets = 0;
					nestedLevel = 0;
				} else if (openingBrackets > nestedLevel) {
					isCloseBracketExpected = true;
				} else if (openingBrackets < nestedLevel) {
					openingBrackets = 0;
					nestedLevel = 0;
				}
			} else {
				openingBrackets = 1;
				nestedLevel = 0;
			}
		}

		System.out.println("maxNestedLevel: " + maxNestedLevel + " pos: " + pos);
	}
}
