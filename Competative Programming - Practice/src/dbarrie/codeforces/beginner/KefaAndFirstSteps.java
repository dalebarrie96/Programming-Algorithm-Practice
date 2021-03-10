package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Kefa And First Steps - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/580/A
 */
public class KefaAndFirstSteps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int res=0;
		
		for(int i=0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i =0; i < n; i++) {
			int count = 0;
			int last = array[i];
			
			for(int j=i;j < n;j++) {
				if(last <= array[j]) {
					count++;
				}else {
					break;
				}
				last = array[j];
			}
			
			if(count > res) res = count;
		}
		
		System.out.println(res);
		
	}

}
