package BaekJoon;
import java.io.*;

public class Solution10039 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		int x=0;
		int sum=0;
		for(int k=0; k<5; k++) {
			x = Integer.parseInt(br.readLine());
			if(x<40)
				x=40;
			sum+=x;
		}
		int avg = sum/5;
		wr.write(String.valueOf(avg));
		
		wr.flush();
		wr.close();
		br.close();
	}
}
