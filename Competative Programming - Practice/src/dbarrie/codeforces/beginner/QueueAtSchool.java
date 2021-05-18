package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces QueueAtSchool - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/266/B
 */
public class QueueAtSchool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		String q = sc.next();
		
		for(int i=0; i < t;i++) {
			q = q.replaceAll("BG", "GB");
		}
		
		System.out.println(q);
	}
}
