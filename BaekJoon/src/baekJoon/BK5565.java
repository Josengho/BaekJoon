package baekJoon;

import java.util.Scanner;

public class BK5565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans;
		
		ans = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < 9; i++) {
			ans -= Integer.parseInt(sc.nextLine());
		}
		System.out.println(ans);
	}

}
