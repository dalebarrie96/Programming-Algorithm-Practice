package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Football - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/59/A
 */
public class Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
		int upper = 0;
		
		for (char c : chars) {
			
			if(Character.isUpperCase(c)) upper++;
			if(upper > chars.length/2) break;
		}
		
		System.out.println(upper > chars.length / 2 ? s.toUpperCase() : s.toLowerCase());
	}

}
