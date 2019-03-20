package BaekJoon;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		String[] str = new String[a];
		int i = 0;
		for (int k = 0; k < a; k++) {
			int sum = 0;
			int count = 0;
			str[k] = br.readLine();
			String[] b = str[k].split("");
			for (int w = 0; w < b.length; w++) {
				list.add(b[w]);
			}
			for (int s = 0; s < b.length; s++) {
				if (list.get(s).contentEquals("O"))
					count++;
				else
					count = 0;
				sum += count;
			}
			list.clear();
			list3.add(sum);
		}
		for (int k = 0; k < list3.size(); k++)
			System.out.println(list3.get(k));
	}
}
