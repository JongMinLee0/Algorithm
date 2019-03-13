import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution15729 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String st = br.readLine();
		String[] str = st.split("");
		String[] str2 = st.replaceAll("1", "0").split("");
		int count = 0;
		// int b1 = (5>4) ? 50 : 40;
		int x = st.indexOf("1");
		while (true) {

			if (x == str.length - 2 || x == str.length - 1)
				for (int k = x; k < str.length; k++) {
					str[x] = (str[x] == "1") ? "0" : "1";
					x++;
				}
			else {
				for (int j = 0; j < 3; j++) {
					str[x] = (str[x] == "1") ? "0" : "1";
					x++;
				}
			}
			count++;

			if (Objects.deepEquals(str, str2)) {
				System.out.println(count);
				break;
			}

		}

	}
}