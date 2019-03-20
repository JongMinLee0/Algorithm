package BaekJoon;
import java.io.*;

public class Solution2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int sum =0;
		for(int k = 0 ; k<str.length; k++) {
			int count = 0;
			int pos = st.indexOf(str[k]);
			while(pos>-1) {
				if(k==2)
					count-=1;
				count = 1;
				pos = st.indexOf(str[k], pos+1);
				sum+=count;
			}
		}
		int result = st.length()-(sum*2);
		System.out.println(result+sum);
		br.close();
	}
}