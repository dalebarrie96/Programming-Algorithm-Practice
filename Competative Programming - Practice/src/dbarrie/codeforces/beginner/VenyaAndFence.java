package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Venya And Fence - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/677/A
 * 
 */
public class VenyaAndFence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), h = sc.nextInt();
		
		int total = n;
		
		for(int i =0; i < n; i++) {
			if(sc.nextInt() > h) total ++;
		}
		
		System.out.println(total);
	}

}
