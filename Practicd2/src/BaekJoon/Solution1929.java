package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] primeArray = new boolean[1000001];
		for (int k = 2; k < primeArray.length; k++) {
			primeArray[k] = true;
		}

		for (int i = 2; (i * i) < primeArray.length; i++) {
			if (primeArray[i]) {
				for (int j = i * i; j < primeArray.length; j += i) {
					primeArray[j] = false;
				}
			}
		}
		for (int i = M; i <= N; i++) {
			if (primeArray[i])
				System.out.println(i);
		}

	}
}
