package BaekJoon;

import java.io.*;
import java.util.*;
public class Solution1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		List<Integer> stack = new ArrayList<>();
		List<String> result = new ArrayList<>();
		int[] nArray = new int [testCase];
		int[] sArray = new int [testCase];
		for(int i = 0; i < nArray.length; i++) {
			nArray[i] = Integer.parseInt(br.readLine());
			sArray[i]=i+1;
		}
		
		int nindex = 0;
		int sindex = 0;
		stack.add(sArray[sindex]);
		sindex++;
		result.add("+");
		while(true) {
			
			if(stack.contains(nArray[nindex])) {
				int num = stack.get(stack.size()-1);
				
				if(num==nArray[nindex]) {
					result.add("-");
					stack.remove(stack.size()-1);
					nindex++;
				}else {
					System.out.println("NO");
					System.exit(0);
					break;
				}
			}else {
				stack.add(sArray[sindex]);
				sindex++;
				result.add("+");
			}
			if(nindex==sArray.length) {
				break;
			}
		}
		for(int k = 0; k < result.size(); k++)
			System.out.println(result.get(k));
	}
}
