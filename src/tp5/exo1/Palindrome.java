package tp5.exo1;

public class Palindrome {

	public static boolean isPalindrome(String mot) {
		boolean bol = true;
		mot = mot.toLowerCase();
		for (int i = 0; i < mot.length() / 2; i++) {
			if (mot.charAt(i) != mot.charAt(mot.length() - i - 1)) {
				bol = false;
			}
		}
		return bol;
	}
}
