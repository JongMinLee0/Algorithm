package BaekJoon;

import java.io.*;

public class Solution10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] input = new int [10001];
		for(int i=0; i < N; i++) {
			input[Integer.parseInt(br.readLine())]++;
		}
		int count = 0;
		int index = 0;
		
		while(true) {
			if(input[index]!=0) {
				for(int i=0; i < input[index]; i++) {
					System.out.println(index);
					count++;
				}
				index++;
			}else {
				index++;
			}
			if(count==N)
				break;
		}
	}
}
