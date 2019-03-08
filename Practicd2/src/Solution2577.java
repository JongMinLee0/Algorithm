import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> str = new ArrayList<>();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = a * b * c;
		int[] ina = new int [10];
		String e = Integer.toString(d);
		String[] str2 = e.split("");
		int count =0;
		while(true) {
			
			str.add(str2[count]);
			int f = Integer.parseInt(str.get(count));
			ina[f]++;
			
			count++;
			if (count==str2.length)
				break;
			
		}
		for(int k=0; k<10; k++)
			System.out.println(ina[k]);
	}
}