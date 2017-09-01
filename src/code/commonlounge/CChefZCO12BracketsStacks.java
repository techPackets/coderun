package code.commonlounge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*Problem Statement: https://www.codechef.com/ZCOPRAC/problems/ZCO12001/*/

public class CChefZCO12BracketsStacks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int pos = -1;
		int maxNestedLevel = Integer.MIN_VALUE;
		int nestedLevel = 0;
		String[] inputString = br.readLine().split(" ");
		Stack<Integer> stack = new Stack<Integer>();
		int symbols = 0;
		int maxSymbols = Integer.MIN_VALUE;
		int maxSymbolsPos = -1;

		for (int i = 1; i <= length; i++) {
			int input = Integer.parseInt(inputString[i - 1]);

			if (input == 1) {
				stack.push(input);
			} else {
				nestedLevel = stack.size();
				stack.pop();

				if (nestedLevel > maxNestedLevel) {
					maxNestedLevel = nestedLevel;
					pos = i - 1;
				}
			}

			symbols += 1;

			if (stack.isEmpty()) {
				if (symbols > maxSymbols) {
					maxSymbols = symbols;
					maxSymbolsPos = i-(symbols-1);
				}
				symbols = 0;
			}
		}

		if (stack.isEmpty()) {
			System.out.println(maxNestedLevel + " " + pos+ " " + maxSymbols + " " + maxSymbolsPos);
		} else {
			System.out.println("braces not matched");
		}
	}
}
