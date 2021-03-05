package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces SoldierAndBanana - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/546/A
 */
public class SoldierAndBanana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int cost = 0;
		
		for(int i=1; i <= w; i++) {
			cost += i * k;
		}
		
		System.out.println(cost - n > 0 ? cost - n : 0);
	}
}
