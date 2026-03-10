package tp5.exo2;

import java.util.StringTokenizer;
import java.util.Stack;

public class Mots {
	private String phrase;

	public Mots() {
		this("");
	}

	public Mots(String phrase) {
		this.phrase = phrase;
	}

	public String miroirMots() {
		StringTokenizer st = new StringTokenizer(this.phrase);
		Stack<String> pile = new Stack<String>();

		while (st.hasMoreTokens()) {
			pile.push(st.nextToken());
		}

		StringBuffer sb = new StringBuffer();
		while (!pile.empty()) {
			sb.append(pile.pop());
			if (!pile.empty()) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public String mirroirLettres() {
		StringBuffer sb = new StringBuffer();
		for (int i = this.phrase.length() - 1; i >= 0; i--) {
			sb.append(this.phrase.charAt(i));
		}
		return sb.toString();
	}
}
