package programmers;

import java.util.HashMap;
// level1 : 완주하지 못한 선수
public class Programmers1 {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden", "kiki" };
		String[] completion = { "eden", "kiki", "kiki" };

		// map에 참가자들의 이름을 집어 넣었다.
		// 참가자들의 이름을 돌며 동명이인의 수를 카운트 해서 집어넣었다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			int count = 1;
			if (map.containsKey(participant[i])) {
				count = map.get(participant[i]);
				count++;
			}
			map.put(participant[i], count);
		}
		
		// 완주자 명단을 돌며 map의 값을 1씩 감소시켰다.
		for (int k = 0; k < completion.length; k++) {
			int count = 1;
			if (map.containsKey(completion[k])) {
				count = map.get(completion[k]);
				count--;
			}
			map.put(completion[k], count);
		}
		
		// 만약 0보다 크다면 완주하지 못한 것이다.
		for (int w = 0; w < participant.length; w++) {
			if(map.get(participant[w])>0)
				System.out.println(participant[w]);
		}
	}

}
