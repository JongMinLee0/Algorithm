package BaekJoon;

import java.io.*;

public class Solution3053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		final double pi = Math.PI;
		System.out.printf("%.6f\n",pi*r*r);
		System.out.printf("%.6f\n",2.0*r*r);
	}
}
