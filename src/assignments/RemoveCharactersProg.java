package assignments;

public class RemoveCharactersProg {
	public static void main(String args[]) {
		String word = "Helloooo";
		String ch = "o";
		word = word.replace(ch, " ");
		word = word.trim();
		System.out.println(word);
	}

}
