import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		int N = 0;
		String s;
		String[] s1;
		List<Double> prin = new ArrayList<Double>();
		for (int k = 0; k < C; k++) {
			double count = 0;
			double sum=0, avg=0, per=0;
			s = br.readLine();
			s1 = s.split(" ");
			for (int i = 1; i < Integer.parseInt(s1[0])+1; i++) {
				sum += Double.parseDouble(s1[i]);
			}
			avg = sum / (Double.parseDouble(s1[0]));
			for (int i = 1; i < Integer.parseInt(s1[0])+1; i++) {
				if (Integer.parseInt(s1[i]) > avg)
					count++;
			}
			per = (count / Double.parseDouble(s1[0])) * 100.0;
			prin.add(per);

		}
		for (int k = 0; k < C; k++) {
			System.out.printf("%.03f"+"%%\n",prin.get(k));
		}
	}

}
