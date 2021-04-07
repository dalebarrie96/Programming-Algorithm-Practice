package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Tram - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/116/A
 */
public class Tram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int current = 0;
		int max = 0;
		
		for(int i=0; i < n; i++) {
			current = current - sc.nextInt() + sc.nextInt();
			if(current > max) max = current;
		}
		
		System.out.println(max);

	}

}
