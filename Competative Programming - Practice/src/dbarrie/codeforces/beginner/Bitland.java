package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Bit++ - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/282/A
 */
public class Bitland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		
		int res = 0;
		
		for(int i = 0; i < x; i++) {
			res = sc.nextLine().contains("++") ? res + 1 : res - 1;
		}
		
		System.out.println(res);

	}

}
