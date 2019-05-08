package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		String[] input = new String[testCase*2];
		
		for (int i = 0; i < testCase*2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[i] = st.nextToken();
			input[i+1] = st.nextToken();
			i++;
		}
		
	}
}
