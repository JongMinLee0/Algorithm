package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;
public class Solution11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int nfac = fac(N);
		int minus = fac(N-K);
		if(K==0) {
			K = 1;
		}
		int kfac = fac(K);
		System.out.println(nfac/(kfac*minus));
	}
	
	public static int fac(int x) {
		int fa = 1;
		for(int i=1; i <= x; i++) {
			fa *= i;
		}
		return fa;
	}
}
