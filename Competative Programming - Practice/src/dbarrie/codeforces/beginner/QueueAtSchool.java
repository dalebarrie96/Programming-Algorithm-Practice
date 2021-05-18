package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces QueueAtSchool - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/266/B
 */
public class QueueAtSchool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		String q = sc.next();
		String res = q;
		
		for(int i=0; i < t;i++) {
			char[] queue = res.toCharArray();
			res = "";
			for (int j =0; j < queue.length; j++) {
				
				if(j == queue.length-1) {
					res += queue[queue.length-1];
				}else {
					if(queue[j] == 'B' && queue[j+1] == 'G') {
						res += "GB";
						j++;
					}else {
						res += queue[j];
					}
				}
			}
		}
		
		System.out.println(res);
	}
}
