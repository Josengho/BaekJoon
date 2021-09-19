package baekJoon;

import java.util.Scanner;

public class BK2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] num = new String[5];
		int score;
		int win;
		int winner;
		
		
		win = 0;
		winner = 0;
		for (int i = 0; i < 5; i++) {
			num = sc.nextLine().split(" ");
			score = 0;
			for (int j = 0; j < num.length; j++) {
				score += Integer.parseInt(num[j]);
				if (win < score) {
					win = score;
					winner = i+1;
				} else if (win == score) {
				}
			}
			
		}
		System.out.println("\n" + winner + " " + win);
	}

}
