package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Word Capitalization - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/281/A
 */
public class WordCapitalization {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println(String.valueOf(text.charAt(0)).toUpperCase() + text.substring(1));
	}

}
