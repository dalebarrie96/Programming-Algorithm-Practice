package dbarrie.codeforces.beginner;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		boolean canDevide = false;
		
		for(int i = 2; i <= w - 2; i = i + 2) {
			
			if(w%i == 0) {
				canDevide = true;
				break;
			}
		}
		
		System.out.println(canDevide ? "YES" : "NO");

	}

}
