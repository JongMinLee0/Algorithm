package BaekJoon;
//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

import java.io.*;
import java.util.StringTokenizer;
public class Solution10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a>=b&&a<=c)
			System.out.println(a);
		else if(a>=c&&a<=b)
			System.out.println(a);
		else if(b>=a&&b<=c)
			System.out.println(b);
		else if(b>=c&&b<=a)
			System.out.println(b);
		else if(c>=a&&c<=b)
			System.out.println(c);
		else if(c>=b&&c<=a)
			System.out.println(c);
		
		br.close();
		
		
	}

}
