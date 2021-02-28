package dbarrie.codeforces.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.nextLine().replaceAll("\\+", "").toCharArray();
		Arrays.sort(in);
		
		String res = "";
		for(int i = 0; i < in.length; i++) {
			
			res += in[i];
			
			if(in.length -1 != i) res += "+";
		}
		
		System.out.println(res);
	}
}
