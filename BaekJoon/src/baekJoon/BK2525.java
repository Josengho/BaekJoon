package baekJoon;

import java.util.Scanner;

public class BK2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] time = new String[2];
		int count;
		int hour;
		int minute;
		
		time = sc.nextLine().split(" ");
		count = Integer.parseInt(sc.nextLine());
		
		hour = Integer.parseInt(time[0]);
		minute = Integer.parseInt(time[1]);
		
		minute += count;
		while (minute >= 60) {
			minute -= 60;
			hour++;
			if (hour > 23) {
				hour = 0;
			}
		}
		System.out.println(hour + " " + minute);
	}

}
