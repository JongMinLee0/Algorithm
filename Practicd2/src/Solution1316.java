import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List ina = new ArrayList<>();
		int count = 0;

		for (int k = 0; k < N; k++) {
			boolean result = true;
			String s = br.readLine();
			String[] st = s.split("");

			for (int j = 0; j < s.length(); j++) {
				int pos = s.indexOf(st[j]);
				while (pos > -1) {
					ina.add(pos);
					pos = s.indexOf(st[j], pos + 1);
				}
				for (int i = 0; i < ina.size() - 1; i++)
					if ((int) ina.get(i + 1) - (int) ina.get(i) != 1 && ina.size() != 0)
						result = false;
				ina.clear();

			}
			if (result)
				count++;
		}
		System.out.println(count);
	}

}