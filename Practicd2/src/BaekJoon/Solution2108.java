package BaekJoon;

import java.io.*;
import java.util.*;

public class Solution2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] mathArray = new int[N];

		for (int i = 0; i < N; i++) {
			mathArray[i] = Integer.parseInt(br.readLine());
		}
		Ave(mathArray);
		Center(mathArray);
		Many(mathArray);
		Range(mathArray);

	}

	public static void Ave(int[] mathArray) {
		int average = 0;
		double sum = 0;
		for (int i = 0; i < mathArray.length; i++) {
			sum += mathArray[i];
		}
		average = (int) Math.round(sum / (double) mathArray.length);

		System.out.println(average);
	}

	public static void Center(int[] mathArray) {
		int center = 0;
		Arrays.sort(mathArray);
		center = mathArray[mathArray.length / 2];

		System.out.println(center);
	}

	public static void Many(int[] mathArray) {
		int[] howMany = new int[mathArray.length];
		
		int compare = mathArray[0];
		howMany[0]++;
		int manyIndex = 0;
		for (int i = 0; i < howMany.length - 1; i++) {

			if (compare == mathArray[i + 1]) {
				howMany[manyIndex]++;
			} else {
				compare = mathArray[i + 1];
				howMany[i + 1]++;
				manyIndex = i + 1;
			}
		}
		int max = howMany[0];
		int maxIndex = 0;
		for (int k = 0; k < howMany.length; k++) {
			if (max < howMany[k]) {
				max = howMany[k];
				maxIndex = k;
			}
		}
		int maxValue = howMany[maxIndex];
		int count = 0;
		List<Integer> index = new ArrayList<Integer>();
		for (int j = 0; j < howMany.length; j++) {
			if (maxValue == howMany[j]) {
				count++;
				index.add(j);
			}
		}
		if (count == 1) {
			System.out.println(mathArray[maxIndex]);
		} else if (count >= 2) {
			System.out.println(mathArray[index.get(1)]);
		}

	}

	public static void Range(int[] mathArray) {
		int range = 0;
		Arrays.sort(mathArray);
		range = mathArray[mathArray.length - 1] - mathArray[0];
		System.out.println(range);
	}
}
