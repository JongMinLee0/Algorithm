package programmers;

public class Programmers14 {
// level1 : 약수의 합
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		////////////////////////////
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				answer += i;
		}
		answer += n;
		////////////////////////////
		System.out.println(answer);
	}
}
