package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces 123 Problem - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/52/A
 */
public class OneTwoThreeProblem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[3];
		
		for(int i = 0; i < n; i++) {
			arr[sc.nextInt() - 1] ++;
		}
		
		System.out.println(n - Math.max(arr[0], Math.max(arr[1], arr[2])));

	}

}
