package Programmers;

// level1 : 가운데 글자 가져오기
// 홀수이면 가운데 글자, 짝수이면 가운데 두글자
public class Programmers4 {
    public static void main(String[] args) {
        String s = "abcdef";
        String answer = "";
        String[] tempArray = s.split("");
        if (tempArray.length % 2 != 0) {
            answer = tempArray[s.length() / 2];
        } else {
            answer = tempArray[s.length() / 2-1] + tempArray[s.length() / 2];
        }
        System.out.println(answer);
    }
}
