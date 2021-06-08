package dbarrie.codeforces.beginner;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Codeforces Puzzles - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/337/A
 */
public class Puzzles {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[] arr = new int[m];
		
		for (int i=0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i < arr.length - (n-1); i++) {
			int v = arr[i + (n-1)] - arr[i];
			if(v < min) {
				min = v;
			}
		}
		
		System.out.println(min != Integer.MAX_VALUE ? min : 0);
	}

}
