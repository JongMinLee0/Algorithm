package programmers;

public class Programmers10 {
// level1 : 문자열을 정수로 바꾸기
	public static void main(String[] args) {
		String s = "-1234";
		int answer = 0;
		/////////////////////////////////////
		if(s.charAt(0)=='-') {
			String st = s.substring(1);
			answer = Integer.parseInt(st)*-1;
		}else {
			answer = Integer.parseInt(s);
		}
		
		/////////////////////////////////////
		System.out.println(answer);
	}
}
