package BaekJoon;
import java.io.*;

public class Solution2920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int[] inte = new int [8];
		int[] inte2 = new int [7];
		int sum =0;
		int count = 0;
		for (int k=0;k<str2.length; k++)
			inte[k] = Integer.parseInt(str2[k]);
		for (int k=0; k<str2.length-1; k++) {
			int x = inte[k+1]-inte[k];
			sum+=x;
			inte2[k]=x;
		}
		for (int k=0; k<inte2.length; k++) {
			if(inte2[k]>0)
				count++;
			else
				count--;
		}
		if (sum==7 && count==7)
			wr.write("ascending");
		else if(sum==-7 && count==-7)
			wr.write("descending");
		else
			wr.write("mixed");
		
		wr.flush();
		wr.close();
		br.close();
			
	}
}
