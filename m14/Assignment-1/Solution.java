import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String[] words = loadWords();
		//Your code goes here...
		TST<Integer> tst = new TST<Integer>();
		Scanner scan = new Scanner(System.in);
		String prefix = scan.nextLine();
		int j = 0;
		for (String each : words) {
			SuffixArray suffix = new SuffixArray(each);
			for (int i = 0;i<words.length;i++) {
				tst.put(suffix.select(i),j++);
			}
		}

	}

	public static String[] loadWords() {
		In in = new In("/Files/dictionary-algs4.txt");
		String[] words = in.readAllStrings();
		return words;
	}
}