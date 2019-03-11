import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> str = new ArrayList<>();
		int a1 = 97;
		char[] ch1 = new char[25];
		int[] in1 = new int[25];
		int N = Integer.parseInt(br.readLine());
		int a = 0;
		int count = 0;
		int result = 0;
		for (int k = 0; k < ch1.length; k++) {
			ch1[k] = (char) a1;
			a1++;
		}
		while (a < N) {
			String st = br.readLine();
			String[] st1 = st.split("");
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == st.charAt(0))
					in1[i] += 1;
			}

			for (int j = 0; j < st1.length - 1; j++) {
				if (st.charAt(j) == st.charAt(j + 1)) {
					for (int i = 0; i < ch1.length; i++) {
						if (ch1[i] == st.charAt(j))
							in1[i] += 1;
					}
				} else {
					for (int i = 0; i < ch1.length; i++) {
						if (ch1[i] == st.charAt(j + 1)) {
							in1[i] += 1;
							if (in1[i] != 1)
								count = 1;
						}

					}

				}

			}
			for (int k = 0; k < st1.length; k++)
				st1[k] = "";
			for (int k = 0; k < in1.length; k++)
				in1[k] = 0;
			if (count == 0)
				result++;
			count = 0;
			a++;
		}

		System.out.println(result);
		br.close();
	}
}
