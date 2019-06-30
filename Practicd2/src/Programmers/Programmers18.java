package Programmers;

// level1 : 시저암호
public class Programmers18 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 25;
        String answer = "";
        ////////////////////////
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == ' ') {
                answer += " ";
            } else if (temp >= 'a' && temp <= 'z') {
                for (int k = 0; k < n; k++) {
                    temp++;
                    if(temp>'z')
                        temp = 'a';
                }
                answer += (char)temp;
            } else if (temp >= 'A' && temp <= 'Z') {
                for (int k = 0; k < n; k++) {
                    temp++;
                    if(temp>'Z')
                        temp = 'A';
                }
                answer += (char)temp;
            }
        }
        ////////////////////////
        System.out.println(answer);
    }
}
