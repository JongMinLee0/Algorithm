package programmers;

public class Programmers9 {
	// level1 : 소수 찾기
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		///////////////////////////////
		boolean [] check = new boolean [n+1];
		check[0] = true;
		check[1] = true;
		for(int i=2; i <= n/2; i++) {
			for(int k=2; i*k < check.length; k++) {
				check[i*k] = true;
			}
		}
		for(int i=0; i < check.length; i++) {
			if(!check[i])
				answer++;
		}
		
		//////////////////////////////
		System.out.println(answer);
	}
}
