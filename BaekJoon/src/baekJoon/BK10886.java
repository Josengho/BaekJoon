package baekJoon;

import java.util.Scanner;

public class BK10886 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people;
		int count = 0;
		int flag;
		
		
		people = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < people; i++) {
			flag = Integer.parseInt(sc.nextLine());
			if (flag == 0) {
				count--;
			} else {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
	}

}
