package BaekJoon;

import java.io.*;

public class Solution1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Case = Integer.parseInt(br.readLine());
		String[] inPut = br.readLine().split(" ");
		int count = 0;
		int result = 0;
		for (int i = 0; i < Case; i++) {
			int prime = Integer.parseInt(inPut[i]);
			if(prime == 1)
				continue;
			else if(prime == 2) {
				result++;
				continue;
			}
			for (int k = 2; k < prime; k++) {
				if (prime % k == 0)
					count++;
			}
			if (count == 0)
				result++;
			else
				count = 0;
		}
		System.out.println(result);
	}

}
