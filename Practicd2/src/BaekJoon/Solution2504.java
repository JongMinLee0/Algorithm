package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution2504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		List<String> stack = new ArrayList<String>();

		int inner = 0;
		int outter = 0;
		int arrayIndex = 0;
		int x = 0;
		int cal = 0;
		while (true) {

			String compare = input[arrayIndex];

			if (compare.equals("(") || compare.equals("[")) {
				stack.add(compare);
				outter++;
			} else if (compare.equals(")")) {
				x = 2;
			} else if (compare.equals("]")) {
				x = 3;
			}
			
			

		}
	}
}