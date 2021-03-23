package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Wrong Subtraction - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/977/A
 */
public class WrongSubtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=0; i < k;i++) {
			String msg = String.valueOf(n);
			
			if(msg.charAt(msg.length()-1) == '0') {
				n = n / 10;
			}else {
				n--;
			}
		}
		
		System.out.println(n);

	}

}
