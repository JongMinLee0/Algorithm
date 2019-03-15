import java.io.*;

public class Solution1193 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int n = 0,max =0;
		int up = 0, down =0;
		
		while(true) {
			max = (n*(n+1))/2;
			if(max >= N)
				break;
			n++;
		}
		int n2 = max - N + 1;
		if(n%2==0) {
			for(int k=1; k<=n2; k++) {
				up = n-k+1;
				down = k;
			}
				
		} else {
			for(int k=1; k<=n2; k++) {
				up = k;
				down = n-k+1;
			}
			
		}
		String st = up+"/"+down;
		System.out.println(st);
	}

}
