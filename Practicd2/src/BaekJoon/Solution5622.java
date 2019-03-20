package BaekJoon;
import java.io.*;
public class Solution5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ina1 = {0,0,0,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,7,7,7,7};
		int[] score = {3,4,5,6,7,8,9,10};
		char[] ch = new char [26];
		int A1 = 65;
		int sum=0;
		for(int k=0; k<ch.length; k++) {
			ch[k] = (char)A1;
			A1++;
		}
		char[] ch2 = br.readLine().toCharArray();
		for (int k=0; k<ch2.length; k++) {
			for(int j=0; j<ch.length; j++) {
				if(ch[j]==ch2[k])
					sum += score[ina1[j]];
			}
		}
		System.out.println(sum);
	}
}
