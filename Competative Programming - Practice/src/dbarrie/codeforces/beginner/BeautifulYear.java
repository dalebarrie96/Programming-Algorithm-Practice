package dbarrie.codeforces.beginner;

import java.util.Arrays;
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
			
			char[] arr = String.valueOf(year).toCharArray();
			Arrays.sort(arr);
			boolean anyMatch = false;
			
			for (int i = 1; i < arr.length; i++) {
				if(arr[i] == arr[i-1]) {
					anyMatch = true;
				}	
			}
			
			if(!anyMatch) isBeautiful = true;
			
		} while(!isBeautiful);
		
		System.out.println(year);

	}

}
