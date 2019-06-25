package programmers;

public class Programmers8 {
// level1 : 문자열 내림차순으로 배치하기
	public static void main(String[] args) {
		String answer = "";
		String s = "Zbcdefg";
		//////////////////////////
		char[] str = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char ch = 20;
			int index = 0;
			for (int k = i; k < s.length(); k++) {
				if(ch <str[k]) {
					ch = str[k];
					index = k;
				}
			}
			str[index] = str[i];
			str[i] = ch;
			
			answer += ch;
		}
		//////////////////////////
		System.out.println(answer);
	}
}
