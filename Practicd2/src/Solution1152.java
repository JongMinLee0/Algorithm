import java.io.*;
import java.util.Scanner;

public class Solution1152 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] st2 = st.split("");
		int count = 0;
		int k = 0;

		while (true) {
			if (st2[k].equals(" ") && k != 0 && k != st2.length - 1)
				count++;
			else if (st2[k].equals(" ") && st2.length==1) {
				count=-1;
				break;
			}
			k++;
			if (k == st2.length - 1)
				break;

		}
		System.out.print(count + 1);
	}
}
