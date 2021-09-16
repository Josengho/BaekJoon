package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BK2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		String num[] = new String[3];
		int day;
		int v;
		int a;
		int b;
		
		num = bf.readLine().split(" ");
		a = Integer.parseInt(num[0]);
		b = Integer.parseInt(num[1]);
		v = Integer.parseInt(num[2]);
		
		if ((v-a)%(a-b) != 0) {
			day = (v-b)/(a-b)+1;
		} else {
			day = (v-b)/(a-b);
		}

		System.out.println(day);
	}

}
