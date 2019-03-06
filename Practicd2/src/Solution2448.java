import java.io.*;

public class Solution2448 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int t1 = N / 3;
		int t2 = (t1-1)*3;
		
		for (int k=0; k<t1 ; k++) {
			for (int a=0; a<t2; a++)
				System.out.print(" ");
			for (int t=0; t<k+1;t++) {
				System.out.print("  *  ");
				System.out.print(" ");
			}
			System.out.print("\n");
			for (int a=0; a<t2; a++)
				System.out.print(" ");
			for (int i=0; i<k+1; i++) {
				System.out.print(" * * ");
				System.out.print(" ");
			}
			System.out.print("\n");
			for (int a=0; a<t2; a++)
				System.out.print(" ");
			for (int j=0; j<k+1; j++) {
				System.out.print("*****");
				System.out.print(" ");
			}
			System.out.print("\n");
			t2-=3;
		}
		
	}
}