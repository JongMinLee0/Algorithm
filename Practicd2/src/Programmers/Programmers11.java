package programmers;

public class Programmers11 {
// level1 : 문자열 내 p와 y의 개수
	public static void main(String[] args) {
		boolean answer = true;
		String s = "Pyy";
		///////////////////////
		String temp = s.toLowerCase();
		String[] str = temp.split("");
		int countP = 0;
		int countY = 0;
		for(String st : str)
			if(st.equals("p"))
				countP++;
			else if(st.equals("y"))
				countY++;
		
		//////////////////////
		System.out.println(countP==countY);
	}
}
