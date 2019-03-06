import java.util.ArrayList;

public class Solution4673 {
	public static void main(String[] args) {
		int n = 10000;
		String t, t2;
		ArrayList alist = new ArrayList();
		for (int k = 0; k <= n; k++) {
			t = k + "";
			alist.add(t);
		}
		for (int k = 0; k <= n; k++) {
			int e1=0;
			int a=0, b=0, c=0, d=0;
			if (k < 100) {
				a = k / 10;
				b = k % 10;
				e1 = k + a + b;
			} else if (100 <= k && k < 1000) {
				a = k / 100;
				b = (k - (a * 100)) / 10;
				c = (k - (a * 100)) % 10;
				e1 = k + a + b + c;
			} else if (k >= 1000) {
				a = k / 1000;
				b = (k - (a * 1000)) / 100;
				c = (k - (a * 1000) - (b * 100)) / 10;
				d = (k - (a * 1000) - (b * 100)) % 10;
				e1 = k + a + b + c + d;
			}
			t2 = e1 + "";
			alist.remove(t2);
			}
		for(int k=0; k<alist.size(); k++)
			System.out.println(alist.get(k));
	}

}
