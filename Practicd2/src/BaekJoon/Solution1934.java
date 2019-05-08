package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		int[] input = new int[testCase * 2];

		for (int i = 0; i < testCase * 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[i] = Integer.parseInt(st.nextToken());
			input[i + 1] = Integer.parseInt(st.nextToken());
			i++;
		}
		for (int k = 0; k < testCase * 2; k++) {
			int first = input[k];
			int second = input[k + 1];

			int max = Math.max(first, second);
			int min = Math.min(first, second);
			for (int w = 1; w <= min; w++) {
				if (min % w == 0) {
					if ((max * w) % min == 0) {
						System.out.println(w * max);
						break;
					}

				}
			}
			k++;
		}
	}
}
