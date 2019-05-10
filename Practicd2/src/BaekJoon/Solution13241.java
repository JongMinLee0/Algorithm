package BaekJoon;

import java.io.*;

public class Solution13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		long A = Long.parseLong(str[0]);
		long B = Long.parseLong(str[1]);

		long max = Math.max(A, B);
		long min = Math.min(A, B);

		System.out.println(lcm(max, min));

	}

	public static long gcd(long max, long min) {
		if (max % min == 0) {
			return min;
		} else {
			return gcd(min, max % min);
		}
	}

	public static long lcm(long max, long min) {
		return (max * min) / (gcd(max, min));
	}
}