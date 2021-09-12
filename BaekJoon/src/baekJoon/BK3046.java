package baekJoon;

import java.util.Scanner;

public class BK3046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ans;
		int r1;
		int s;
		
		String[] num = new String[2];
		
		num = sc.nextLine().split(" ");
		s = Integer.parseInt(num[1]);
		r1 = Integer.parseInt(num[0]);
		
		ans = s*2-r1;
				
		System.out.println(ans);
	}

}
