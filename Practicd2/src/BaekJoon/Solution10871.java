package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Solution10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String st2 = new String(br.readLine());
		String[] st3;
		st3 = st2.split(" ");
		
		int j = 0;
		for (int k=0; k<N; k++) {
			if(Integer.parseInt(st3[k])<X) {
				System.out.print(st3[k]+" ");
			}
		}
		br.close();
	}

}
