package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Hit the Lottery - Difficulty 800
 * 
 * DP Practice
 * 
 * https://codeforces.com/problemset/problem/996/A
 */
public class HitTheLottery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int res = 0;
		
		do {
			if(c >= 100) {
				res++;
				c = c - 100;
				continue;
			}else if(c >= 20) {
				res++;
				c = c - 20;
				continue;
			}else if(c >= 10) {
				res++;
				c = c - 10;
				continue;
			}else if(c >= 5) {
				res++;
				c = c - 5;
				continue;
			}else {
				res++;
				c--;
				continue;
			}
		}while(c > 0);

		System.out.println(res);
	}

}
