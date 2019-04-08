package BaekJoon;

import java.io.*;
import java.util.Arrays;

public class Solution10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] resultArray = new int [N];
		int[] finalArray = new int [N];
		int max = 0;
		for(int i=0; i<N; i++) {
			resultArray[i] = Integer.parseInt(br.readLine());
			if(max<resultArray[i])
				max = resultArray[i];
		}
		int[] count = new int [max];
		for(int k=0; k<resultArray.length; k++)
			count[resultArray[k]-1]++;
		for(int j=1; j<count.length; j++)
			count[j] += count[j-1];
		
		for(int i=resultArray.length-1; i>=0; i--) {
			finalArray[count[resultArray[i]-1]-1] = resultArray[i];
			count[resultArray[i]-1]--;
		}
		for(int w=0; w < finalArray.length; w++)
			System.out.println(finalArray[w]);
		
	}
}
