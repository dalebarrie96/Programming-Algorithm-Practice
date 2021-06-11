package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Fair Playoff - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/1535/A
 */
public class FairPlayoff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		
		for(int i=0; i < n; i++) {
			String[] games = sc.nextLine().split(" ");
			int minFirst = Math.min(Integer.valueOf(games[0]),Integer.valueOf(games[1]));
			int maxFirst = Math.max(Integer.valueOf(games[0]),Integer.valueOf(games[1]));
			int minSecond = Math.min(Integer.valueOf(games[2]),Integer.valueOf(games[3]));
			int maxSecond = Math.max(Integer.valueOf(games[2]),Integer.valueOf(games[3]));
			
			if(minFirst > maxSecond || minSecond > maxFirst) {
				arr[i] = "NO";
			}else {
				arr[i] = "YES";
			}
		}
		
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
