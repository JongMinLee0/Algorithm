package java0418_basic;

import java.io.*;
import java.util.*;

public class Solution1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] result = new int [testCase];
		for(int i = 0; i <testCase; i++) {
			int count = 1;
			String[] input = br.readLine().split(" ");
			String[] important = br.readLine().split(" ");
			List<Integer> seq = new ArrayList<Integer>();
			List<String> index = new ArrayList<String>();
			
			int alpha = 65;
			for(int j = 0; j < important.length; j++) {
				char beta = (char)alpha;
				index.add(String.valueOf(beta));
				alpha++;   
			}
			String want = index.get(Integer.parseInt(input[1]));
			for(int k = 0; k < important.length; k++) {
				int seq2 = Integer.parseInt(important[k]);
				seq.add(seq2);
			}
			
			while(true) {
				int max = seq.get(0);
				int find = 0;
				
				for(int i1=0; i1 < index.size(); i1++) {
					if(max<seq.get(i1))
						find++;
				}
				if(find!=0) {
					seq.add(seq.get(0));
					seq.remove(0);
					index.add(index.get(0));
					index.remove(0);
				}else {
					if(index.get(0).equals(want)) {
						result[i] = count;
						break;
					}
					else {
						count++;
						seq.remove(0);
						index.remove(0);
					}
				}
			}
			
		}
		for(int i=0; i <result.length; i++)
			System.out.println(result[i]);
	}

}
