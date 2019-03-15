import java.io.*;

public class Solution2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int n1 = 0;
		while (true) {
			int max = (3 * n1) * (n1 + 1) + 1;
			n1++;
			if (max >= N)
				break;

		}
		System.out.println(n1);
	}
}
