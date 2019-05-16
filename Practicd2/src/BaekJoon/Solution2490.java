package BaekJoon;

import java.io.*;

public class Solution2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		
		for(int i=0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		
		String[] result = {"E", "A", "B", "C", "D"};
		for(int k=0; k < str.length; k++) {
			String[] conf = str[k].split(" ");
			
			int count = 0;
			for(int j=0; j < conf.length; j++) {
				if(conf[j].equals("0"))
					count++;
			}
			
			System.out.println(result[count]);
			
		}
	}
}
