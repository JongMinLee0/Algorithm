package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
// level1: 체육복
public class Programmers7 {
    public static void main(String[] args) {
        int n = 5; // 전체 학생수
        int[] lost = {4, 2}; // 잃어버린 학생 번호
        int[] reserve = {3, 5}; // 줄 수 있는 학생의 수
        int answer = 0;
        /////////////////////////////////
        Arrays.sort(lost);
        Arrays.sort(reserve);
        answer = n - lost.length;
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> lostList = new ArrayList<Integer>();
        for (int i : reserve)
            aList.add(i);
        for (int k : lost)
            lostList.add(k);

        for (int i = 0; i < aList.size(); i++) {
            for (int k = 0; k < lostList.size(); k++) {
                if (lostList.get(k) == aList.get(i)) {
                    aList.remove(i);
                    lostList.remove(k);
                    answer++;
                    i=-1;
                    break;
                }
            }
        }

        for (int i = 0; i < lostList.size(); i++) {
            for (int k = 0; k < aList.size(); k++) {
                if (lostList.get(i) - 1 == aList.get(k) || lostList.get(i) + 1 == aList.get(k)) {
                    aList.remove(k);
                    answer++;
                }
            }
        }

        /////////////////////////////////
        System.out.println(answer);
    }
}
