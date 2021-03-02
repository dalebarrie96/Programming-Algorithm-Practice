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
		String resp = "";
		
		for(int i =0; i < in.length(); i++) {
			if(!resp.contains("" + in.charAt(i))) resp += in.charAt(i);
		}
		
		System.out.println(resp.length() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
	}

}
