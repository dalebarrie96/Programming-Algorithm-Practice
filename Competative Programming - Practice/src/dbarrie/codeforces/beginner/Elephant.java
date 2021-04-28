package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Elephant - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/617/A
 */
public class Elephant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n%5 == 0 ? n/5 : n/5 + 1;
		
		System.out.println(res);

	}

}
