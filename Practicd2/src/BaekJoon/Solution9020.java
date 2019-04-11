package BaekJoon;

import java.io.*;

public class Solution9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] input = new int[testCase];
		for (int i = 0; i < testCase; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		for (int k = 0; k < input.length; k++) {
			int prime1 = input[k] / 2;
			int prime2 = input[k] / 2;
			while (true) {
				if (primeResult(prime1) && primeResult(prime2)) {
					System.out.println(prime1 + " " + prime2);
					break;
				} else {
					prime1--;
					prime2++;
				}
			}

		}
	}

	public static boolean primeResult(int prime) {
		boolean result = false;
		int count = 0;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0)
				count++;
		}
		if (count == 0)
			result = true;

		return result;
	}
}
