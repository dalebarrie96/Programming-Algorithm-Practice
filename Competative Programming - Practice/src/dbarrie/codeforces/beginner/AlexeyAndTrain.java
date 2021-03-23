package dbarrie.codeforces.beginner;	

import java.util.Scanner;

public class AlexeyAndTrain {

	/*
	 * Codeforces Alexey And Train - Difficulty 800
	 * 
	 * https://codeforces.com/problemset/problem/1501/A
	 * 
	 * TODO: Fix please
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] res = new int[t];
		
		for(int tc=0; tc < t; tc++) { //tc == test case
			int s = sc.nextInt(); //s == stations
			int[][] stationsArr = new int[s][2];
			for(int st = 0; st < s; st++) { //st == station
				stationsArr[st][0] = sc.nextInt();
				stationsArr[st][1] = sc.nextInt();
				sc.nextLine();
			}
			
			String[] delays = sc.nextLine().split(" ");
			
			for(int d=0; d < delays.length-1; d++) { //skip last -- last == solution
				int plannedArrival = stationsArr[d][0];
				int actualArrival = stationsArr[d][0] + Integer.valueOf(delays[d]);
				int plannedDepart = stationsArr[d][1];
				int minDuration = Math.round((float)(plannedDepart - actualArrival) / 2); //big decimal maybe?
				int travelTime = stationsArr[d+1][0] - plannedDepart;
				
//				System.out.println("******* Solving *******");
//				System.out.println(stationsArr[d][0] + " - " + stationsArr[d][1]);
//				System.out.println("**********************");
				
				stationsArr[d][0] = actualArrival;
				
				if(actualArrival > plannedDepart || plannedDepart - actualArrival < minDuration) {
					
					int actualDepart = minDuration <= 0 ? actualArrival + 1 : actualArrival + minDuration;
					
					stationsArr[d][1] = actualDepart;
					stationsArr[d+1][0] = actualDepart + travelTime;
				}
				
//				System.out.println("******* Resolved to *******");
//				System.out.println(stationsArr[d][0] + " - " + stationsArr[d][1]);
//				System.out.println("***************************");
				
				
			}
			
			res[tc] = stationsArr[delays.length-1][0] + Integer.valueOf(delays[delays.length-1]);
		}
		
		for (int i : res) {
			System.out.println(i);
		}
	}
}
