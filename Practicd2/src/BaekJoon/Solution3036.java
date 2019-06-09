package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String[] radius = br.readLine().split(" ");
        // 첫 번째 원의 반지름을 first에 저장
        int first = Integer.parseInt(radius[0]);

        for (int i = 1; i < radius.length; i++) {
            int a = first > Integer.parseInt(radius[i]) ? first : Integer.parseInt(radius[i]);
            int b = first < Integer.parseInt(radius[i]) ? first : Integer.parseInt(radius[i]);

            int temp1 = a;
            int temp2 = b;
            // 최대공약수 na
            int na = 0;

            while (true) {
                na = a % b;
                a = b;
                if (na == 0) {
                    break;
                }
                b = na;
            }
            System.out.println((first / b) + "/" + (Integer.parseInt(radius[i]) / b));
        }

    }
}
