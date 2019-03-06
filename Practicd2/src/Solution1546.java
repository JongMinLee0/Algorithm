import java.io.*;
import java.util.StringTokenizer;

public class Solution1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int t;
		double score, sum=0;
		int[] tArray = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int k=0; k<N; k++) {
			t = Integer.parseInt(st.nextToken());
			tArray[k] = t;
		}
		double j = tArray[0];
		for (int i=1; i<N; i++) {
			if(j>tArray[i])
				j=j;
			else
				j=tArray[i];
		}
		for (int k=0; k<N; k++) {
			score = ((double)tArray[k]/j)*100;
			sum +=score;
		}
		double avg = sum/N;
		System.out.println(avg);
		
	}

}
