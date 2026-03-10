package tp5.exo1;

public class TestPalindrome {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Veuillez saisir un mot.");
			return;
		}

		String mot = args[0];

		if (Palindrome.isPalindrome(mot)) {
			System.out.println(mot + " est un palindrome");
		} else {
			System.out.println(mot + " n'est pas un palindrome");
		}
	}
}
