package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces QAQ - Difficulty 800
 * 
 * DP Practice
 * 
 * https://codeforces.com/problemset/problem/894/A
 */
public class QAQ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		int count = 0;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == 'Q') {
				for(int a=i; a < arr.length; a++) {
					
					if(arr[a] == 'A') {
						
						for(int q = a; q < arr.length; q++) {
							if(arr[q] == 'Q') {
								count ++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(count);
		
	}

}
