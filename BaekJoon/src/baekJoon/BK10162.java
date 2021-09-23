package baekJoon;

import java.util.Scanner;

public class BK10162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int a;
		int b;
		int c;
		int t;
		
		num = Integer.parseInt(sc.nextLine());
		a = 300;
		b = 60;
		c = 10;
		
		if (num/a == 0) {
			a = 0;
			if (num/b == 0) {
				b = 0;
				if (num/c == 0) {
					System.out.println("-1");
				} else {
					t = num%c;
					c = num/c;
					if (t != 0) {
						System.out.println("-1");
					} else {
						System.out.println(a + " " + b + " " + c);
					}
				}
			} else {	//num/b가 0이 아닐 때
				t = num%b;
				b = num/b;
				if (t == 0) {
					c = 0;
					System.out.println(a + " " + b + " " + c);
				} else {	// num/b가 0이 아닌데 나머지가 있을 때
					num = t%c;
					c = t/c;
					if (num != 0) {
						System.out.println("-1");
					} else {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		} else if (num/a != 0) {
			t = num%a;
			a = num/a;
			if (t == 0) {
				b = 0;
				c = 0;
				System.out.println(a + " " + b + " " + c);
			} else {
				num = t%b;
				b = t/b;
				if (num == 0) {
					c = 0;
					System.out.println(a + " " + b + " " + c);
				} else {
					t = num%c;
					c = num/c;
					if (t != 0) {
						System.out.println("-1");
					} else {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}
}
