package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces George and Accommodation - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/467/A
 */
public class GeorgeAndAccommodation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int p = sc.nextInt(), c = sc.nextInt();
			if(p + 2 <= c) count++;
		}
		
		System.out.println(count);
	}

}
