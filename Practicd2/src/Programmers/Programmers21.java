package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Programmers21 {
// level1 : 정수 내림차순으로 배치하기
	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		////////////////////////////
		String[] str = (n+"").split("");
		Arrays.sort(str);
		Collections.reverse(Arrays.asList(str));
		String st = "";
		for(int i=0; i < str.length; i++) {
			st += str[i];
		}
		answer = Long.parseLong(st);
		////////////////////////////
		System.out.println(answer);
	}
}
