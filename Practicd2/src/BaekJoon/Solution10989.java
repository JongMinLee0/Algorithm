package BaekJoon;

import java.io.*;

public class Solution10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
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
					wr.write(String.valueOf(index));
					wr.newLine();
					count++;
				}
				index++;
			}else {
				index++;
			}
			if(count==N)
				break;
		}
		wr.flush();
		wr.close();
		br.close();
	}
}

