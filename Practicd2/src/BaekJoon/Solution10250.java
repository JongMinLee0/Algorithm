package BaekJoon;

import java.io.*;

public class Solution10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] result = new int[testCase];
		int height = 0, floor = 0, roomNum = 0;
		for (int i = 0; i < testCase; i++) {
			String[] inPut = br.readLine().split(" ");
			height = Integer.parseInt(inPut[0]);
			int wide = Integer.parseInt(inPut[1]);
			int numBer = Integer.parseInt(inPut[2]);

			if(numBer % height == 0)
				floor = height;
			else
				floor = numBer % height;
			
			if(floor == height)
				roomNum = (numBer/height);
			else
				roomNum = (numBer / height) + 1;
			
			if (height != 1) {
				result[i] = (floor * 100) + roomNum;
			} else {
				result[i] = 100 + numBer;
			}

		}
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

}
