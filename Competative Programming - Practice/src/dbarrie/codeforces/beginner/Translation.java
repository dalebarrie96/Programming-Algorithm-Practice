package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Translation - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/41/A
 */
public class Translation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new StringBuilder(sc.nextLine()).reverse().toString();
		
		System.out.println(s.equals(sc.nextLine()) ? "YES" : "NO");
	}
}
