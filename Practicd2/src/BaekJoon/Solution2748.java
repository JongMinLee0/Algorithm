package BaekJoon;
import java.util.Scanner;
import java.io.*;

public class Solution2748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] pibo = new long[n + 1];
		if (n == 0) {
			System.out.println("0");
			System.exit(0);
		}
		pibo[0] = 0;
		pibo[1] = 1;

		for (int i = 2; i <= n; i++) {
			pibo[i] = pibo[i - 1] + pibo[i - 2];
		}

		System.out.println(pibo[n]);
	}
}
