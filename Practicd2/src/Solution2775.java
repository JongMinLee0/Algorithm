import java.io.*;

class Floor {
	class Init {
		private int index;
		private int index2;
		private int[] temp;

		public Init(int k, int n) {
			this.index = k;
			this.index2 = n;
			this.temp = new int[n];
		}
	}

	public int howMany(int k, int n) {
		Init init = new Init(k, n);
		int[] ary = makeAry(n);
		sumAry(ary, init);
		init.index--;
		if (init.index == 0) {
			return init.temp[n - 1];
		} else {
			while (init.index > 0) {
				init.index2 = n;
				sumAry(init.temp, init);
				init.index--;
			}
			return init.temp[n - 1];
		}

	}

	public void sumAry(int[] ary, Init init) {
		int sum = 0;
		for (int i = 0; i < init.index2; i++) {
			sum += ary[i];
		}
		init.index2--;
		init.temp[init.index2] = sum;
		sum = 0;
		if (init.index2 > 0) {
			sumAry(ary, init);
		}
	}

	public int[] makeAry(int n) {
		int[] ary = new int[n];
		for (int i = 0; i < n; i++)
			ary[i] = i + 1;
		return ary;
	}

}

public class Solution2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] t1 = new int[t];
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			Floor floor = new Floor();
			t1[i] = floor.howMany(k, n);
		}
		for (int i = 0; i < t; i++)
			System.out.println(t1[i]);
		br.close();
	}

}
