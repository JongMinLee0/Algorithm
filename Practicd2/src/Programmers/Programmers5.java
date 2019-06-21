package programmers;

// level1: 두 정수 사이의 합
public class Programmers5 {

	class Solution {
		  public long solution(int a, int b) {
		      long answer = 0;
		      if(a==b) {
					return a;
				}
				int max = a > b ? a : b;
				int min = a < b ? a : b;
				
				for(int i = min; i <= max; i++) {
					answer += i;
				}
		      return answer;
		  }
		}
}
