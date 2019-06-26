package programmers;

public class Programmers13 {
// level1 : 문자열 다루기
	public static void main(String[] args) {
		boolean answer = true;
		String s = "012346";
		////////////////////////////////////
		if(s.charAt(0)=='0')
			answer = false;
		if(s.length() == 4 || s.length() == 6)
			answer = true;
		else
			answer = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9')
				answer = false;
			
		}

		////////////////////////////////////
		System.out.println(answer);
	}
}
