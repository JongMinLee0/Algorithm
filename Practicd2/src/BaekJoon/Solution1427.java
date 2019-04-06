package BaekJoon;

import java.io.*;
import java.util.*;

public class Solution1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] preInputBuffer = br.readLine().split("");
		Integer[] inputBuffer = new Integer[preInputBuffer.length];
		for (int i = 0; i < inputBuffer.length; i++) {
			inputBuffer[i] = Integer.parseInt(preInputBuffer[i]);
		}
		Arrays.sort(inputBuffer);
		List<Integer> list = Arrays.asList(inputBuffer);
		Collections.reverse(list);
		inputBuffer = list.toArray(new Integer[list.size()]);

		for (int i = 0; i < inputBuffer.length; i++)
			System.out.print(inputBuffer[i]);
	}
}
