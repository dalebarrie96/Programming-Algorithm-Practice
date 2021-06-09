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
		int[] arr = new int[n];
		int one =0, two =0, three=0;
		
		for(int i = 0; i < n; i++) {
			int no = sc.nextInt();
			arr[i] = no;
			if(no == 1) {
				one ++;
			}else if(no == 2) {
				two++;
			}else {
				three++;
			}
		}
		
		if(one >= two && one >= three) {
			System.out.println(two + three);
		}else if(two >= one && two >= three) {
			System.out.println(one + three);
		}else if(three >= one && three >= two) {
			System.out.println(one + two);
		}else {
			System.out.println(one + two);
		}

	}

}
