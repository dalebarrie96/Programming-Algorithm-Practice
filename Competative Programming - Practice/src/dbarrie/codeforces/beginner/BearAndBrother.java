package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Bear and brother - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/791/A
 */
public class BearAndBrother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		do {
			count++;
			l = l*3;
			b = b*2;
		}while(b >= l);
		
		System.out.println(count);
	}

}
