package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * TODO - This is unsubmitted so probably not finished.
 * 
 * Codeforces Tricky Sum - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/598/A
 */
public class TrickySum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i <t; i++) {
			int n = sc.nextInt();
			int total = 0;
			
			for(int y=1; y <= n;y++) {
				
				if((int)(Math.ceil((Math.log(y) / Math.log(2)))) 
			            == (int)(Math.floor(((Math.log(y) / Math.log(2)))))) {
					total -= y;
				}else {
					total += y;
				}
			}
			
			System.out.println(total);
		}
	}

}
