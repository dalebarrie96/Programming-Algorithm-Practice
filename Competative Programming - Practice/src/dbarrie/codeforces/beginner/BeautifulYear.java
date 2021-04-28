package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Beautiful Year - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/271/A
 * 
 */
public class BeautifulYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isBeautiful = false;
		
		do {
			year++;
			
			if(String.valueOf(year).chars().distinct().count() == 4) isBeautiful = true; 
			
		} while(!isBeautiful);
		
		System.out.println(year);

	}

}
