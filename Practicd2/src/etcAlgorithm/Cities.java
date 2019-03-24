package etcAlgorithm;

import java.util.*;

class Solution {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		int[] index = new int[cacheSize];
		int count = 0;
		int count2 = 0;
		int index1 = 0;
		int max = 0;
		List<String> strList = new ArrayList<String>();
		List<String> cacheList = new ArrayList<String>();

		if (cacheSize == 0)
			return answer = cities.length * 5;
		while (count != cacheSize) {
			if (count2 == cacheSize)
				break;

			String city3 = cities[index1];
			String city = "";
			for (int i = 0; i < city3.length(); i++) {
				char c = city3.charAt(i);
				if (c >= 65 && c <= 90) {
					city += String.valueOf(c).toLowerCase();
				} else {
					city += c;
				}
			}

			if (cacheList.contains(city)) {
				int index2 = cacheList.indexOf(city);
				index[index2] = 0;
				answer += 1;
				for (int i = 0; i < cacheSize; i++) {
					if (i != index2)
						index[i]++;
				}
				count2++;

			} else {
				cacheList.add(city);
				int index2 = cacheList.indexOf(city);
				for (int i = 0; i < cacheSize; i++) {
					if (i != index2)
						index[i]++;
				}
				index[index2] = 0;
				count++;
				answer += 5;
			}
			index1++;
		}
		for (int i = count + count2; i < cities.length; i++) {

			String city3 = cities[i];
			String city2 = "";
			for (int w = 0; w < city3.length(); w++) {
				char c = city3.charAt(w);
				if (c >= 65 && c <= 90) {
					city2 += String.valueOf(c).toLowerCase();
				} else {
					city2 += c;
				}
			}
			if (cacheList.contains(city2)) {
				int index2 = cacheList.indexOf(city2);
				index[index2] = 0;
				for (int j = 0; j < cacheSize; j++) {
					if (j != index2)
						index[j]++;
				}
				answer += 1;
			} else {
				for (int k = 0; k < index.length; k++) {
					if (index[max] < index[k])
						max = k;
				}
				cacheList.remove(max);
				cacheList.add(max, city2);
				index[max] = 0;
				for (int j = 0; j < cacheSize; j++) {
					if (j != max)
						index[j]++;
				}
				answer += 5;
			}

		}

		return answer;
	}
}

public class Cities {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int cacheSize = 2;
		String[] cities = { "Jeju", "Pangyo", "NewYork", "newyork" };
		System.out.println(sol.solution(cacheSize, cities));
	}
}
