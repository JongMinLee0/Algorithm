package BaekJoon;
import java.io.*;
public class Solution2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int count=0;
		String st;
		String[] str;
		String[] str2;
		while(true) {
			count++;
			st = br.readLine();
			str = st.split(" ");
			str2 = str[1].split("");
			for(int k=0;k<str2.length;k++) {
				for(int j=0;j<Integer.parseInt(str[0]);j++)
					wr.write(str2[k]);
			}
			wr.write("\n");
			if(count==T)
				break;
		}
		wr.flush();
		wr.close();
		br.close();
	}

}
