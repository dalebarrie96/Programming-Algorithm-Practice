package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Anton And Danik - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/734/A
 */
public class AntonAndDanik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] str = sc.next().toCharArray();
		
		int a = 0, d = 0;
		
		for(int i =0; i < n; i++) {
			if(str[i] == 'A') {
				a++;
			}else {
				d++;
			}
		}
		
		if(a > d) {
			System.out.println("Anton");
		}else if (d > a) {
			System.out.println("Danik");
		}else {
			System.out.println("Friendship");
		}
		
	}
}
