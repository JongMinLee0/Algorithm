package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution2609 {

    public static void main(String[] args) throws IOException {
        // 최소 공배수와 최대 공약수를 구하라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        // a에 큰수 b에 작은 수를 저장
        int a = Integer.parseInt(input[0]) > Integer.parseInt(input[1]) ? Integer.parseInt(input[0]) : Integer.parseInt(input[1]);
        int b = (a == Integer.parseInt(input[1])) ? Integer.parseInt(input[0]) : Integer.parseInt(input[1]);

        // a와 b가 같은경우 바로 종료
        if (a == b) {
            System.out.println(a);
            System.out.println(a);
            return;
        }

        // 최대공약수 na, 최소공배수 so
        int so = a * b;
        int na = 0;

        while (true) {
            na = a % b;
            a = b;
            if (na == 0) {
                break;
            }
            b = na;
        }
        so = so / b;
        System.out.println(b);
        System.out.println(so);


    }
}
