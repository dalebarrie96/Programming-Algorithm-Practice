package dbarrie.codeforces.beginner;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Codeforces WayTooLongWords - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/71/A
 */
public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int n = Integer.valueOf(str);
		
		IntStream.range(0, n).forEach(i -> {
			String word = sc.nextLine();
			System.out.println(word.length() > 10 ? "" + word.charAt(0) + (word.length()-2) + word.charAt(word.length()-1) : word);
		});
		
		
	}

}
