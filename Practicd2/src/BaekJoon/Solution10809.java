package BaekJoon;
import java.io.*;

public class Solution10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		String[] Alp = {"a", "b", "c", "d", "e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"
				,"t","u","v","w","x","y","z"};
		int[] cou = new int [26];
		for(int k=0;k<cou.length; k++)
			cou[k] = -1;
		
		for(int k=0; k<Alp.length; k++) {
			int loca = 0;
			loca = st.indexOf(Alp[k]);
			cou[k] = loca;
		}
		for(int k=0; k<Alp.length; k++)
			System.out.print(cou[k]+" ");
	}

}
