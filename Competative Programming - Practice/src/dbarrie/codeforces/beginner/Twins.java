package dbarrie.codeforces.beginner;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Codeforces Twins - Difficulty 900
 * 
 * https://codeforces.com/problemset/problem/160/A
 */
public class Twins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int[] coins = new int[no];
		int max = 0;
		
		for(int i=0; i < no; i++) {
			int c = sc.nextInt();
			coins[i] = c;
			max += c;
		}
		
		Arrays.sort(coins);
		
		int cVal = 0, cNo = 0;
		for(int i=coins.length-1; i >=0;i--) {
			cVal += coins[i];
			cNo++;
			
			if(cVal > max-cVal) {
				System.out.println(cNo);
				break;
			}
		}

	}

}
