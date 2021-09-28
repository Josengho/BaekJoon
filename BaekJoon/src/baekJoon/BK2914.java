package baekJoon;

import java.util.Scanner;

public class BK2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] song;
		
		song = sc.nextLine().split(" ");
		int alb = Integer.parseInt(song[0]);
		int ave = Integer.parseInt(song[1]);
		int ans;
		ans = alb * (ave-1)+1;
		
		System.out.println(ans);
		
		
	}

}
