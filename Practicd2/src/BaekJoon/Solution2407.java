package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution2407 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		BigInteger big = new BigInteger("1");
		BigInteger big2 = new BigInteger("1");
		if (n == m) {
			System.out.println(1);
			return;
		}
		long x = 1;
		int diff = n - m;
		for (; n > diff; n--) {
			big = big.multiply(BigInteger.valueOf(n));
		}
		long y = 1;
		for (; m > 1; m--) {
			big2 = big2.multiply(BigInteger.valueOf(m));
		}
		big = big.divide(big2);
		System.out.println(big);
	}
}
