package BaekJoon;

import java.io.*;

public class Solution1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] roomNum = br.readLine().split("");
		int[] numSet = new int[10];
		int numSum = 0;
		int max = 0;
		for (int i = 0; i < roomNum.length; i++) {
			int numBer = Integer.parseInt(roomNum[i]);
			numSet[numBer]++;
		}
		for (int i = 0; i < numSet.length; i++) {
			if (i != 6 && i != 9) {
				if (max < numSet[i])
					max = numSet[i];
			}
		}
		int exCeption2 = (numSet[6] + numSet[9]) / 2;
		double exCeption = ((double) numSet[6] + (double) numSet[9]) / 2.0;
		int count2 = (exCeption > exCeption2) ? exCeption2 + 1 : exCeption2;

		System.out.println((count2 > max) ? count2 : max);
	}
}
