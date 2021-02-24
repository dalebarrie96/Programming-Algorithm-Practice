package dbarrie.codeforces.beginner;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine().toLowerCase();
		String str2 = sc.nextLine().toLowerCase();
		
		String res = "0";
	
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) > str2.charAt(i)) res = "1";
			if(str2.charAt(i) > str1.charAt(i)) res = "-1";
			if(res != "0") break;
		}
		
		System.out.println(res);
	}

}
