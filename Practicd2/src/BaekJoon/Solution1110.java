package BaekJoon;
import java.io.*;
import java.util.StringTokenizer;

public class Solution1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int z = Integer.parseInt(br.readLine());
		int a = 0, b = 0, sum = 0, sum2 = 0, sum3 = 0;
		int count = 0;
		if (z == 0) {
			System.out.println("1");
		} 
		else if(z<10) {
			a = 0;
			b = z % 10;
		}
		else {
			a = z / 10;
			b = z % 10;
		}
		while (sum3 != z) {
			sum = a + b;
			sum2 = sum % 10;
			sum3 = (b * 10) + sum2;
			count++;
			if (sum3 == z) {
				System.out.println(count);
			}
			a = sum3 / 10;
			b = sum3 % 10;
		}

	}
}
