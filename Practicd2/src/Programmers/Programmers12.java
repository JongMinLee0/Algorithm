package programmers;

import java.util.Arrays;

public class Programmers12 {
// level1 : 나누어 떨어지는 숫자 배열
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		int [] answer = {};
		/////////////////////////
		Arrays.sort(arr);
		int count = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i]%divisor==0)
				count++;
		}
		if(count==0) {
			answer = new int [1];
			answer[0] = -1;
		}else {
			int index = 0;
			answer = new int [count];
			for(int i=0; i < arr.length; i++) {
				if(arr[i]%divisor==0) {
					answer[index] = arr[i];
					index++;
				}
			}
		}
		
		////////////////////////
	}
}
