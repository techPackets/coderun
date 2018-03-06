package code.hackerrank.math;

import java.math.BigInteger;
import java.util.Scanner;

/*https://www.hackerrank.com/challenges/p1-paper-cutting/problem
*/
/*Initially the solution was written using int data type 
but that was causing integer overflow
Used BigInteger to fix that*/
public class PaperCutting {

	static BigInteger solve(BigInteger n, BigInteger m){
        //return ((n-1) + (n*(m-1)));
        return (n.multiply(m).subtract(BigInteger.ONE));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        BigInteger result = solve(n, m);
        System.out.println(result);
        
    }
}
