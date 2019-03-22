package BaekJoon;

import java.io.*;

public class Solution6064 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] result = new int[testCase];
		for (int i = 0; i < testCase; i++) {
			String[] input = br.readLine().split(" ");
			int M = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[1]);
			int x = Integer.parseInt(input[2]);
			int y = Integer.parseInt(input[3]);

			while (true) {

				if (x == y) {
					result[i] = x;
					break;
				}
				if (x > y) {
					y = y + N;
				} else {
					x = x + M;
				}
				
				if(x>M*N) {
					result[i] = -1;
					break;
				}

			}
		}
		for (int i = 0; i < testCase; i++)
			System.out.println(result[i]);
	}

}
