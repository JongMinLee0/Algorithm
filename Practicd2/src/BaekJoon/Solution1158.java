package BaekJoon;

import java.io.*;
import java.util.*;

public class Solution1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]) - 1;
		int[] result = new int[N];
		List<Integer> josep = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			josep.add(i+1);
		}
		
		int index =K;
		int index2 = 0;
		
		while(josep.size()>0) {
			
			result[index2] = josep.get(index);
			josep.remove(index);
			index += K;
			while(index>=josep.size()) {
				index -= josep.size();
				if(josep.size()==0)
					break;
			}
			index2++;
		}

		
		System.out.print("<");
		for (int j = 0; j < result.length - 1; j++) {
			System.out.print(result[j] + ", ");
		}
		System.out.print(result[result.length - 1] + ">");

	}
}