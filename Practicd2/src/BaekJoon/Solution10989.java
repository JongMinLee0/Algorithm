package BaekJoon;

import java.io.*;
import java.util.*;
public class Solution10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> inPut = new ArrayList<>();
		for(int i=0; i < N; i++) {
			int index = Integer.parseInt(br.readLine());
			inPut.add(index, 1);
		}
	}
}
