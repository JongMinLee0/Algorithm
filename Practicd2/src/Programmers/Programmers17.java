package programmers;

public class Programmers17 {
// level1 : 이상한 문자 만들기
	public static void main(String[] args) {
		String s = "a  b v   d";
		String answer = "";
		////////////////////////////////
		int index = 0;
		for(int i=0; i < s.length(); i++) {
			String temp = s.charAt(i)+"";
			if(temp.equals(" ")) {
				answer += temp;
				index = 0;
			}else {
				if(index%2==0)
					answer += temp.toUpperCase();
				else
					answer += temp.toLowerCase();
				index++;
			}
		}
		////////////////////////////////
		System.out.println(answer);
	}
}
