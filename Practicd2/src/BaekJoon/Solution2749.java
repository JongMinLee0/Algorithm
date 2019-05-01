package BaekJoon;

import java.io.*;

public class Solution2749 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		int mod = 1000000;
		long p = mod/10*15;
		long[] pibo = new long [(int) p];
		
		pibo[0] = 0;
		pibo[1] = 1;
		for(int i=2; i < p; i++) {
			pibo[i] = pibo[i-1] + pibo[i-2];
			pibo[i] %= mod;
		}
		
		System.out.println(pibo[(int) (n%p)]);
		
	}
}
