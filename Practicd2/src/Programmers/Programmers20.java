package Programmers;

public class Programmers20 {
    // level1 : 콜라츠 추측
    public static void main(String[] args) {
        int num = 626331;
        int answer = 0;
        ////////////////////////////
        long x = num;
        while (x != 1) {
            if(x % 2==0) {
                x = x / 2;
            }else{
                x = (x*3) + 1;
            }
            answer++;
            if(answer==500) {
                answer = -1;
                break;
            }
        }

        ////////////////////////////
        System.out.println(answer);
    }
}
