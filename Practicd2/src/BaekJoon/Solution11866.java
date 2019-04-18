package BaekJoon;

import java.io.*;
import java.util.*;
// runtime error
public class Solution11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]) - 1;
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> josep = new ArrayList<Integer>();

		for (int i = 0; i < N; i++)
			josep.add(i + 1);

		int index = K;
		int count = 0;
		while (true) {
			result.add(josep.get(index));
			josep.remove(index);
			index += K;
			if (index >= josep.size()) {
				index = index - josep.size();
				if (index == josep.size()) {
					for (int k = 0; k < index; k++) {
						result.add(josep.get(0));
						josep.remove(0);
					}
					break;
				}
			}
			count++;
			if (count == N)
				break;
		}
		System.out.print("<");
		for(int j=0; j<result.size()-1; j++) {
			System.out.print(result.get(j)+", ");
		}
		System.out.print(result.get(result.size()-1)+">");
	}
}
