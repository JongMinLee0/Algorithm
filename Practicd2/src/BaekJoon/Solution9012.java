package BaekJoon;

import java.io.*;

public class Solution9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		int testData = Integer.parseInt(br.readLine());
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testData; i++) {
			String[] input = br.readLine().split("");
			for (int k = 0; k < input.length; k++) {
				if (input[k].equals("(")) {
					count++;
				} else {
					count--;
				}
				if (count < 0) {
					sb.append("NO\n");
					count = -1;
					break;
				}
			}
			if (count != 0 && count > 0) {
				sb.append("NO\n");
			} else if (count == 0) {
				sb.append("YES\n");
			}
			count = 0;
		}
		wr.write(sb.toString());
		wr.flush();
		wr.close();
		br.close();
	}
}
