package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Last Years Substring - Difficulty 800
 * 
 * DP Practice
 * 
 * https://codeforces.com/problemset/problem/1462/B
 */
public class LastYearsSubstring {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		String[] res = new String[t];
		
		for(int i=0; i < t; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			if(s.equals("2020")) {
				res[i] = "YES";
			}else if(s.startsWith("2020") || s.endsWith("2020")) {
				res[i] = "YES";
			}else if(s.startsWith("2")){
				if(s.startsWith("2") && s.endsWith("020")) {
					res[i] = "YES";
				}else if(s.startsWith("20") && s.endsWith("20")) {
					res[i] = "YES";
				}else if(s.startsWith("202") && s.endsWith("0")){
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}else {
				res[i] = "NO";
			}
		}
		
		for (String string : res) {
			System.out.println(string);
		}
		
		
	}

}
