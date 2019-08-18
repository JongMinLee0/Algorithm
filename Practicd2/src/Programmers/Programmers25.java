package Programmers;

import java.util.Arrays;
import java.util.Comparator;

// 2018년 카카오 블라인드 채용 - 실패율
public class Programmers25 {
    public static void main(String[] args) {
        int[] stages = {1};
        int[] answer = solution(7, stages);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int clear = 0; // clear한 갯수

        // clear 한 갯수를 세는 for문
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                clear++;
            }
        }

        // 숫자값을 바로 인덱스로 사용하기 위해서 1을 더해준다.
        double[] count = new double[answer.length+1];
        // 갯수를 세는 반복문
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1)
                continue;
            count[stages[i]]++;
        }

        int num = clear;
        for (int i = count.length - 1; i > 0; i--) {
            num += count[i];
            if(num==0) {
                count[i] = 0;
                continue;
            }
            count[i] /= num;
        }
        // 실험을 위한 실패율을 저장하는 배열
        double[] rate = new double [N];
        // 마지막 실패율로 정렬
        for (int i = 0; i < answer.length; i++) {
            double max = -1;
            int index = 0;
            for (int k = 1; k < count.length; k++) {
                if (max < count[k]) {
                    max = count[k];
                    index = k;
                }
            }
            answer[i] = index;
            count[index] = -1;
            rate[i] = max;
        }
        for(int i=0; i < rate.length; i++){
            System.out.println(answer[i] + " : " + rate[i]);
        }
        return answer;
    }
}
