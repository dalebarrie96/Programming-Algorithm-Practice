package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Dubstep - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/208/A
 */
public class Dubstep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(s.replace("WUB", " ").replaceAll(" +", " ").trim());
	}

}
