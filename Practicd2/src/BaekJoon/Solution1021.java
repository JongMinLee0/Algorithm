package BaekJoon;
import java.io.*;
import java.util.*;

public class Solution1021 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> number = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		int[] imsi = new int [N];
		StringTokenizer sol = new StringTokenizer(br.readLine());
		for(int i=0; i < M; i++) {
			int input = Integer.parseInt(sol.nextToken());
			imsi[input-1] = input;
			answer.add(input);
		}
		for(int num : imsi)
			number.add(num);
		
		int count = 0;
		while(answer.size()!=0) {
			
			if(answer.get(0).equals(number.get(0))) {
				answer.remove(0);
				number.remove(0);
			}else {
				int index = number.indexOf(answer.get(0));
				if(index > number.size()/2) {
					number.add(0, number.get(number.size()-1));
					number.remove(number.size()-1);
					count++;
				}else {
					number.add(number.get(0));
					number.remove(0);
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
