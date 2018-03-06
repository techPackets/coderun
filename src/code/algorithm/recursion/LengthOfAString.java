package code.algorithm.recursion;

public class LengthOfAString {

	public static int calLengthOfAString(String s) {
		if (s == null || s.equals(""))
			return 0;

		return 1 + calLengthOfAString(s.substring(1));
	}

	public static void main(String[] args) {
		int length = calLengthOfAString("abcdefg");
		System.out.println(length);
	}

}
