package dbarrie.codeforces.beginner;

import java.util.Scanner;

/*
 * Codeforces Fair Division - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/1472/B
 */
public class FairDivision {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt(); //Number of test cases
		String[] res = new String[no];
		
		for(int i=0; i < no; i++) { //For each test case
			int sweets = sc.nextInt();
			
			int two = 0;
			int one = 0;

			for(int s=0; s < sweets; s++) { //setup array of sweets for this test case
				int grams = sc.nextInt();
				if(grams == 2) {
					two++;
				}else {
					one++;
				}
			}
			
			
			if(two%2==0) {
				if(one%2==0) {
					res[i] = "YES";
				}else {
					res[i] = "NO";
				}
			}else{
				if(one >=2) {
					if(one%2==0) {
						res[i] = "YES";
					}else {
						res[i] = "NO";
					}
				}else {
					res[i] = "NO";
				}
				
			}
			
			
			
		}
		
		for(int i=0; i < res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
