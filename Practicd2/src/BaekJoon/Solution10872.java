package BaekJoon;

import java.io.*;

public class Solution10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int fac = 1;
		if (N == 0) {
			System.out.println("1");
			System.exit(0);
		}
		for (int i = 1; i <= N; i++) {
			fac *= i;
		}
		System.out.println(fac);

	}
}
