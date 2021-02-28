package dbarrie.codeforces.beginner;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Codeforces HelpfulMaths - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/339/A
 */
public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split("\\+");
		Arrays.sort(in);
		
		System.out.println(String.join("+", in));
	}
}
