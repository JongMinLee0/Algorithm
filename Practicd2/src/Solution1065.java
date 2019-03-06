import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a=0,b=0,c=0;
		int count=0;
		if (N==1000)
			N=999;
		if (N<100)
			System.out.println(N);
		for(int k=100;k<=N;k++) {
			a = k/100;
			b = (k-(a*100))/10;
			c = (k-(a*100))%10;
			if (a-b == b-c)
				count++;
			}
		if (N>=100)
			System.out.println(count+99);
	}
}
