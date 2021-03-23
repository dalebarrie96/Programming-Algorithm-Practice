package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Elephant - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/617/A
 */
public class Elephant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		do {
			count++;
			if(n >=5) {
				n = n - 5;
			}
			else if(n == 4) {
				n = n - 4;
			}
			else if(n == 3) {
				n = n - 3;
			}
			else if(n == 2) {
				n = n - 2;
			}
			else if(n == 1) {
				n = n - 1;
			}
			
		}while(n > 0);
		
		System.out.println(count);

	}

}
