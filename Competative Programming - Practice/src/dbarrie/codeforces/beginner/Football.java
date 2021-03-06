package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Football - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/96/A
 */
public class Football {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		System.out.println(in.contains("1111111") || in.contains("0000000") ? "YES" : "NO" );
	}
}
