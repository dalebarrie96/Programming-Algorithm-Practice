package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Maximum Increase - Difficulty 800
 * 
 * DP Practice
 * 
 * https://codeforces.com/problemset/problem/702/A
 */
public class MaximumIncrease {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int last = sc.nextInt();
		int count =1, res=0;
		
		for(int i =1; i < n; i++) {
			int next = sc.nextInt();
			if(next > last) {
				count++;
			}else {
				if(count > res) {
					res = count;
				}
				count = 1;
			}
			last = next;
		}
		
		System.out.println(count > res ? count : res);
	}

}
