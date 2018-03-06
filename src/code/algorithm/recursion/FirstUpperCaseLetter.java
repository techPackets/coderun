package code.algorithm.recursion;

public class FirstUpperCaseLetter {

	public static char findFirstUpperCaseLetter(String s) {
		int asciiValue = s.charAt(0);

		if (asciiValue >= 65 && asciiValue <= 90) {
			return s.charAt(0);
		}
		return findFirstUpperCaseLetter(s.substring(1));
	}

	public static void main(String[] args) {
		char firstUpperCase = findFirstUpperCaseLetter("abcDefg");
		System.out.println(firstUpperCase);
	}

}
