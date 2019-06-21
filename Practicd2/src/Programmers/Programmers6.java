package programmers;

import java.util.ArrayList;

// 2018 윈터코딩(level 2) : 스킬트리

public class Programmers6 {

	public static void main(String[] args) {
		String skill = "QWEBCA";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		int answer = 0;
		///////////////////////////////////////
		
		String[] str = skill.split("");
		ArrayList<String> aList = new ArrayList<String>();
		
		// skill을 리스트에 추가
		for(int i = 0; i < str.length; i++) {
			aList.add(str[i]);
		}
		
		for(int i=0; i < skill_trees.length; i++) {
			String[] temp = skill_trees[i].split("");
			int index = 0;
			boolean result = true;
			for(int k=0; k < temp.length; k++) {
				if(aList.contains(temp[k])){
					if(aList.get(index).equals(temp[k])) {
						if(!result)
							break;
						else
							index++;
					}else {
						result = false;
					}
				}
			}
			if(result)
				answer++;
		}
		
		
		//////////////////////////////////////
		System.out.println(answer); // 나중에 return answer
	}
}
