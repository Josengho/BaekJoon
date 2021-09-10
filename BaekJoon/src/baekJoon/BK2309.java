package baekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BK2309 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> height = new ArrayList<>();
		int num;
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < 9; i++) {
			height.add(Integer.parseInt(sc.nextLine()));
		}
		

		num = height.get(0)+height.get(1)+height.get(2)+height.get(3)+height.get(4)+height.get(5)+height.get(6)+height.get(7)+height.get(8)-100;
		loop1 : for (int i = 0; i < height.size(); i++) {
			for (int j = i+1; j < height.size(); j++) {
				if (num == height.get(i)+height.get(j)) {
					count2 = i;
					count = j;
					i = height.size();
					break loop1;
				}
			}
		}
				height.remove(count);
				height.remove(count2);

		for (int i = 0; i < height.size(); i++) {
			for (int j = 0; j < height.size(); j++) {
				if (height.get(j) > height.get(i)) {
					num = height.get(j);
					height.set(j, height.get(i));
						height.set(i, num);
				}
			}
		}

		for (int i = 0; i < height.size(); i++) {
			System.out.println(height.get(i));
		}
		
	}

}
