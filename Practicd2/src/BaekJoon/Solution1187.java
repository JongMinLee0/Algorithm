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
			if(testCase==1) {
				System.out.println(inList.get(i));
				System.exit(0);
			}
			if (!modList.contains(inList.get(i))) {
				modList.add(inList.get(i));
			}
		}
		String[] strArray = modList.toArray(new String[0]);
		Arrays.sort(strArray);
		ArrayList<String> resultList = new ArrayList<String>(Arrays.asList(strArray));
		String[] resultArray = new String[strArray.length];
		int index = 0;
		int index2 = 0;
		int count2 = 0;
		while(true) {
			int count = 0;
			int min = resultList.get(index).length();
			for(int i = 0; i < resultList.size(); i++) {
				if(min > resultList.get(i).length()) {
					min = resultList.get(i).length();
					index2 = i;
					count++;
				}
			}
			if(count != 0) {
				resultArray[count2] = resultList.get(index2);
				count2++;
				resultList.remove(index2);
			}else {
				resultArray[count2] = resultList.get(0);
				resultList.remove(0);
				count2++;
			}
			if(count2==strArray.length)
				break;
			
		}
		for (int i = 0; i < strArray.length; i++)
			System.out.println(resultArray[i]);

	}
}
