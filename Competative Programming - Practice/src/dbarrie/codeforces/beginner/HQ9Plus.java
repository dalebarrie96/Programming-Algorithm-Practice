package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces HQ9+ - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/133/A
 */
public class HQ9Plus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		System.out.println(in.contains("H") || in.contains("Q") || in.contains("9") ? "YES" : "NO" );
	}
}
