package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Stones on a table - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/266/A
 */
public class StonesOnATable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[] row = sc.next().toCharArray();

		int count=0;
		
		for(int i = 1; i < n; i++) {
			if(row[i] == row[i-1]) count++;
		}
		
		System.out.println(count);
	}

}
