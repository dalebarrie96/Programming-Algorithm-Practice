package dbarrie.codeforces.beginner;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Watermelon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		boolean canDevide = IntStream.range(0, w).anyMatch( i -> i > 0 && i % 2 == 0 && w%i == 0);
		
		System.out.println(canDevide ? "YES" : "NO");

	}

}
