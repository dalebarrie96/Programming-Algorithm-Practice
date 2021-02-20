package dbarrie.codeforces.beginner;

import java.util.Scanner;


public class NextRound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cons =  sc.nextLine();
		String res = sc.nextLine();
		
		String[] consArr = cons.split(" ");
		String[] resArr = res.split(" ");
		
		int n = Integer.valueOf(consArr[0]);
		int k = Integer.valueOf(consArr[1]);
		
		int target = Integer.valueOf(resArr[k-1]);
		
		int countNot = 0;
		
		for(int i = resArr.length -1; i >= 0; i--) {
			if( Integer.valueOf(resArr[i]) <= 0 || Integer.valueOf(resArr[i]) < target ) {
				countNot++;
			}else {
				break;
			}
		}
		
		System.out.println(n - countNot);
		
	}

}
