package Programmers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 2018년 카카오 블라인드 채용 오픈채팅방
public class Programmers24 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] answer = solution(record);
        for (String st : answer) {
            System.out.println(st);
        }
    }

    public static String[] solution(String[] record) {
        String[] answer = {};
        List<String> aList = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] temp = record[i].split(" ");
            if (temp[0].charAt(0) == 'E') {
                aList.add(temp[1] + "님이 들어왔습니다.");
            } else if (temp[0].charAt(0) == 'L') {
                aList.add(temp[1] + "님이 나갔습니다.");
            }
            if (temp.length == 3) {
                map.put(temp[1], temp[2]);
            }
        }
        answer = new String[aList.size()];
        for (int i = 0; i < aList.size(); i++) {
            String[] temp2 = aList.get(i).split("님");
            answer[i] = aList.get(i).replaceAll(temp2[0], map.get(temp2[0]));
        }
        return answer;
    }
}
