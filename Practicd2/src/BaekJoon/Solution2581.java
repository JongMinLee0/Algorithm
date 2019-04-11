package BaekJoon;

import java.io.*;

public class Solution2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		int sum = 0;
		int min = 0;
		for (int k = M; k <= N; k++) {
			if (primeResult(k)) {
				count++;
				sum = sum + k;
				if (count == 1)
					min = k;
			}
		}
		if (count == 0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		br.close();
		
	}

	public static boolean primeResult(int prime) {
		boolean result = false;
		int count = 0;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0)
				count++;
		}
		if (count == 0 && prime != 1)
			result = true;

		return result;
	}
	
}
