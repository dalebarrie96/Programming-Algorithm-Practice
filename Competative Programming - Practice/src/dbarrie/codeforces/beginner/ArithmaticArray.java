package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Arithmatic Array - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/1537/A
 */
public class ArithmaticArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i < t; i++) {
			int n = sc.nextInt(), steps = 0, numerator = 0;
			
			for(int j=0; j < n;j++) {
				numerator += sc.nextInt();
			}
			
			if(numerator < n) {
				steps = 1;
			}else if(numerator > n) {
				steps = numerator - n;
			}
			
			
			System.out.println(steps);
		}
	}

}
