package BaekJoon;

import java.io.*;

class Solution2448 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(input.readLine());
		int index = 0;
		String[] star = new String[N];
		star[0] = "  *  ";
		star[1] = " * * ";
		star[2] = "*****";

		for (int k = 1; 3 * (int) Math.pow(2, k) <= N; ++k) {
			int N2 = 3 * (int) Math.pow(2, k);
			int blank = N2 / 2;

			for (int i = blank; i < N2; ++i) {
				star[i] = star[i - blank] + " " + star[i - blank];
			}

			String space = "";
			while (space.length() < blank) {
				space += " ";
			}
			for (int i = 0; i < blank; ++i) {
				star[i] = space + star[i] + space;
			}
		}
		for (int i = 0; i < star.length; i++)
			System.out.println(star[i]);

	}
}