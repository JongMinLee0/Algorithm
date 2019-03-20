package BaekJoon;
import java.io.*;

public class Solution2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] st = br.readLine().split("");
		int[] st2 = new int[6];
		int change = 0;
		for (int k = 0; k < st.length; k++) {
			if (k != 1 && k != 3 && k != 5) {
				change += Integer.parseInt(st[k]);
			}
			if (k == 2) {
				st2[0] = change - Integer.parseInt(st[0]);
				change = change - Integer.parseInt(st[2]);
				st2[1] = Integer.parseInt(st[1]);
				st2[2] = change;
				change = 0;
			} else if (k == 6) {
				st2[3] = change - Integer.parseInt(st[4]);
				change = change - Integer.parseInt(st[6]);
				st2[4] = Integer.parseInt(st[5]);
				st2[5] = change;
			}
		}
		int A = (st2[0] * 100) + (st2[1] * 10) + st2[2];
		int B = (st2[3] * 100) + (st2[4] * 10) + st2[5];
		if (A > B)
			System.out.println(A);
		else
			System.out.println(B);

		wr.flush();
		wr.close();
		br.close();
	}
}
