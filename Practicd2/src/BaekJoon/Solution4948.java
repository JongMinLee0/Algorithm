package BaekJoon;

import java.io.*;
import java.util.*;

public class Solution4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> nList = new ArrayList<>();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0)
				break;
			nList.add(n);
		}
		
		boolean[] primeArray = new boolean[(123456*2)+1];
		for (int k = 2; k < primeArray.length; k++) {
			primeArray[k] = true;
		}
		for (int i = 2; (i * i) < primeArray.length; i++) {
			if (primeArray[i]) {
				for (int j = i * i; j < primeArray.length; j += i) {
					primeArray[j] = false;
				}
			}
		}
		
		
		int index = 0;
		while(index<nList.size()) {
			int count = 0;
			for(int k = nList.get(index)+1; k <= nList.get(index)*2; k++) {
				if(primeArray[k])
					count++;
			}
			index++;
			System.out.println(count);
		}

	}

}
