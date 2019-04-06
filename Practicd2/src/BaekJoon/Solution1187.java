package BaekJoon;

import java.io.*;
import java.util.*;

public class Solution1187 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> inList = new ArrayList<String>();
		ArrayList<String> modList = new ArrayList<String>();
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			inList.add(br.readLine());
			if (!modList.contains(inList.get(i))) {
				modList.add(inList.get(i));
			}
		}
		String[] strArray = modList.toArray(new String[0]);
		Arrays.sort(strArray);
		int index = 0;
		for (int i = 0; i < strArray.length; i++) {
			int count = 0;
			int compare = strArray[i].length();
			String temp = strArray[i];
			for (int k = i; k < strArray.length; k++) {
				if (compare > strArray[k].length()) {
					compare = strArray[k].length();
					index = k;
					count++;
				}
			}
			if (count != 0) {
				strArray[i] = strArray[index];
				strArray[index] = temp;
			}
		}

		for (int i = 0; i < strArray.length; i++)
			System.out.println(strArray[i]);

	}
}
