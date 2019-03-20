package BaekJoon;
import java.io.*;

public class Solution1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		String[] st2 = st.split("");
		char[]ch3 = new char [1000000];
		char[]ch1 = new char[26];
		char[]ch2 = new char[26];
		int a1=97;
		int A1=65;
		int result=0;
		int count=0;
		int max=0;
		int [] b = new int [26];
		for(int k=0; k<ch1.length; k++) {
			ch1[k] = (char)a1;
			ch2[k] = (char)A1;
			a1++;
			A1++;
		}
		
		for(int k=0; k<st2.length; k++) {
			ch3[k]=st.charAt(k);
			for(int j=0; j<ch1.length; j++) {
				if(ch1[j]==ch3[k] || ch2[j]==ch3[k])
					b[j] += 1;
			}
		}
		for(int k=0; k<b.length; k++)
			if(b[k]>max) {
				max=b[k];
				result =k;
			}
		for(int k=0; k<b.length; k++)
			if(b[result]==b[k])
				count++;
		if(count>1)
			wr.write("?");
		else
			wr.write(ch2[result]);
		
		
		wr.flush();
		wr.close();
		br.close();
		
	}
}
