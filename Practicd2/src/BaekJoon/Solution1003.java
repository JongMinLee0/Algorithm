package BaekJoon;

import java.io.*;

public class Solution1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] input = new int [testCase];
		for(int i = 0; i < testCase; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		int[][] result = new int [testCase][2];
		for(int k =0; k < testCase; k++) {
			int[][] fibo = new int [input[k]+1][2];
			if(input[k]==0) {
				result[k][0] = 1;
				result[k][1] = 0;
				continue;
			}
			fibo[0][0] = 1;
			fibo[0][1] = 0;
			fibo[1][0] = 0;
			fibo[1][1] = 1;
			
			for(int i=2; i <= input[k]; i++) {
				fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
				fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
			}
			result[k][0] = fibo[input[k]][0];
			result[k][1] = fibo[input[k]][1];
		}
		for(int w=0; w<result.length; w++) {
			System.out.print(result[w][0]+" ");
			System.out.println(result[w][1]);
		}
	}

}
