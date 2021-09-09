package baekJoon;

import java.util.Scanner;

public class BK2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String time[] = new String[2];
		int hour;
		int minute;
		time = sc.nextLine().split(" ");

		hour = Integer.parseInt(time[0]);
		minute = Integer.parseInt(time[1]);

		if (minute >= 45) {
			minute -= 45;	
		} else {
			if (hour == 0) {
				hour = 24;
			}
			hour--;
			minute = 60 + minute - 45;
		}
		System.out.println(hour);
		System.out.println(minute);
	}
}
