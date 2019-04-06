package BaekJoon;

import java.io.*;

public class Solution1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] result = new int[testCase];
		for (int i = 0; i < testCase; i++) {
			String[] input1 = br.readLine().split(" ");
			int x = Integer.parseInt(input1[0]);
			int y = Integer.parseInt(input1[1]);

			int sub1 = x - y;
			if (sub1 == 1) {
				result[i] = 1;
			} else if (sub1 == 0) {
				result[i] = 2;
			} else {
				int sub2 = sub1 -2;
				
			}
		}

	}

}
