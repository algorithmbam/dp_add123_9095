package algorithm_123_plus_logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusLogicOf123 {

	private static int d[]= new int[12];
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int testCase= Integer.valueOf(br.readLine());
		
		for (int i= 1; i <= testCase; i++) {
			int input= Integer.valueOf(br.readLine());
			int result= dp(input);
			System.out.println(result);
		}
	}

	public static int dp(int input) {
		
		if(input == 1) {
			d[1]= 1;
			return d[1];
			
		} else if(input == 2) {
			d[2]= 2;
			return d[2];
			
		} else if(input == 3) {
			d[3]= 4;
			return d[3];
			
		} else {
			
			if(d[input] != 0) {
				
			} else {
				d[input]= dp(input-1) + dp(input-2) + dp(input-3);
			}
			
			return d[input];
		}
	}
}
