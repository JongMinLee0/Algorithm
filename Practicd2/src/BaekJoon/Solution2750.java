package BaekJoon;

import java.io.*;

public class Solution2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] sortArray = new int [N];
		int index = 1;
		for(int i = 0; i < N; i++) {
			sortArray[i] = Integer.parseInt(br.readLine());
		}
		if(N==1) {
			System.out.println(sortArray[0]);
			System.exit(0);
		}
		for(int k = 0; k < N; k++) {
			int compare = sortArray[k];
			if(compare>sortArray[index]) {
				sortArray[k] = sortArray[index];
				sortArray[index] = compare;
				k = -1;
				index=1;
			} else {
				index++;
			}
			if(index == N)
				break;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(sortArray[i]);
		}
	}
}
