package baekJoon;

import java.util.Scanner;

public class BK1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		String input;
		

		
		while (true) {
			input = sc.nextLine();
			length = input.length();
			if (input.equals("0")) {
				break;
			} else {
				if (length == 1) {
					System.out.println("yes");
				} else if(length > 1 && length < 4) {
					if (input.substring(0, 1).equals(input.substring(input.length()-1, input.length()))) {
						System.out.println("yes");
					} else
						System.out.println("no");
				} else if(length > 3) {
					if (!(input.substring(0, 1).equals(input.substring(input.length()-1, input.length())))) {
						System.out.println("no");
					} else {
						if (input.substring(1, 2).equals(input.substring(input.length()-2, input.length()-1))) {
							System.out.println("yes");
						} else {
							System.out.println("no");
						}
					}
				}
			}
		}

	}

}
