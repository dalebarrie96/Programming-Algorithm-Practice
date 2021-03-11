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
		array[0] = sc.nextInt();
		int res=0;
		
		int count=1;
		
		for(int i=1; i < n; i++) {
			array[i] = sc.nextInt();
			
			if(array[i-1] <= array[i]) {
				count++;
			}else {
				if(count > res) res = count;
				count = 1;
			}
			
		}
		
		System.out.println(res > count ? res : count);
		
	}

}
