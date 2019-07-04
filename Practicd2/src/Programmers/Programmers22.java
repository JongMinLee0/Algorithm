package Programmers;

public class Programmers22 {
// level1 : 정수 제곱근 판별
	public static void main(String[] args) {
		long n = 3;
		long answer = 0;
		////////////////////////////////
		long start = (long) Math.sqrt(n);
		for(long i=start; i <= start+2; i++) {
			if(i*i == n) {
				answer = (i+1)*(i+1);
			}
		}
		answer = -1;
		////////////////////////////////
		
	}
}
