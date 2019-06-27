package Programmers;
// level1 : 서울에서 김서방 찾기
public class Programmers15 {
    public static void main(String[] args) {
        String[] seoul = {"Jene", "Kim"};
        String answer = "";
        //////////////////////////////////////
        int index = 0;
        for(int i=0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index = i;
                break;
            }
        }
        answer = "김서방은 "+index+"에 있다.";
        //////////////////////////////////////
        System.out.println(answer);
    }
}
