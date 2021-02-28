package dbarrie.codeforces.beginner;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y=0;
		
		for(int i=0; i < 5; i++) { //i = row
			char[] col = sc.nextLine().replaceAll(" ", "").toCharArray();
			
			for(int j = 0; j < col.length; j++) {
				if(col[j] == '1') {
					x = i + 1;
					y = j + 1;
				}
			}
		}
		
		int xDif = Math.abs(x - 3);
		int yDif = Math.abs(y - 3);
		
		System.out.println(xDif + yDif);
		
	}

}
