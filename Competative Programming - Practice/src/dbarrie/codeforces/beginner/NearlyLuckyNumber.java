package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Nearly Lucky Number- Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/110/A
 */
public class NearlyLuckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] no = sc.next().toCharArray();
		int count = 0;
		
		for (char c : no) {
			if(c == '4' || c == '7') count++;
		}
		
		System.out.println(count == 4 || count == 7 ? "YES" : "NO");
	}
}
