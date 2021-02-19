package dbarrie.codeforces.beginner;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/*
 * Codeforces A Team - Difficulty 800
 * 
 * https://codeforces.com/problemset/problem/231/A
 */
public class ATeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		
		IntPredicate predicate = ( i ->{
			String canResolveMap = sc.nextLine();
			
			canResolveMap = canResolveMap.replace(" ", "").replace("0", "");
			
			return canResolveMap.length() >= 2;
		});
		
		System.out.println(IntStream.range(0, n).filter(predicate).count());

	}
}
