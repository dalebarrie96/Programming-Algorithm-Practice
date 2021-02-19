package dbarrie.codeforces.beginner;

import java.util.*;

public class ATeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			String canResolveMap = sc.nextLine();
			
			canResolveMap = canResolveMap.replace(" ", "").replace("0", "");
			
			if(canResolveMap.length() >= 2) count++;
			
		}
		
		System.out.println(count);

	}

}
