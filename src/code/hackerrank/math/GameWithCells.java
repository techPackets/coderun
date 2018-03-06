package code.hackerrank.math;

import java.util.Scanner;

/*Problem Statement: https://www.hackerrank.com/challenges/game-with-cells/problem
*/
public class GameWithCells {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int minDrops = ((n+n%2)*(m+m%2))/4;
        
        System.out.println(minDrops);
    }

}
