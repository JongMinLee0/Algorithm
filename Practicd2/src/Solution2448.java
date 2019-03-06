import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution2448 {
	public static List<String> sTar() {
		List<String> st = new ArrayList<>();
		List<String> st2 = new ArrayList<>();
		st.add("  *  ");
		st.add(" * * ");
		st.add("*****");

		return st;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int t1 = N / 3;
		int t2 = (t1 - 1) * 3;
		int t = 0;
		boolean x = true;
		List<String> str = sTar();
		List<String> str2 = new ArrayList<>();
		while (x) {
			// N을 2로 나눈거 까지 반복한다.
			if (t == 0) {
				for (int k = 0; k < 3; k++) {
					System.out.println(str.get(k));
					str2.add(str.get(k));
				}
			}
			t++;
			if(N==3)
				break;
			int f = str2.size();
			for(int j=0; j<f; j++) {
					System.out.print(str2.get(j));
					str2.add(str2.get(j));
					System.out.print(str2.get(j));
					str2.add(str2.get(j));
					if(j==f-1)
						System.out.print("\n");
				
			}
			if(t==t1-1)
				x=false;
			
		}

	}
}