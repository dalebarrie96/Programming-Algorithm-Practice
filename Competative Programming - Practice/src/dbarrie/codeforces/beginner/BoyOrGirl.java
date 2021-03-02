package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces BoyOrGirl - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/236/A
 */
public class BoyOrGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		System.out.println(in.chars().distinct().count() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
	}

}
