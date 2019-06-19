package programmers;

// level1: 모의고사

public class Programmers2 {

	public static void main(String[] args) {
		int[] answer = {};
		int[] answers = { 1,2,3,4,5,1,2,4,5,4,5,4,2,1,5 };
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int index = 0;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < answers.length; i++) {
			if(num1[index]==answers[i])
				count1++;
			if(num2[index1]==answers[i])
				count2++;
			if(num3[index2]==answers[i])
				count3++;
			index++;
			index1++;
			index2++;
			if(index==num1.length)
				index = 0;
			if(index1==num2.length)
				index1 = 0;
			if(index2==num3.length)
				index2 = 0;
		}		
		if(count1>count2 && count1>count3){
            answer = new int[1];
            answer[0] = 1;
        }
		else if(count2>count1 && count2>count3){
            answer = new int[1];
            answer[0] = 2;
        }
		else if(count3>count1 && count3>count2){
            answer = new int[1];
            answer[0] = 3;
        }
		else if(count1==count2 && count2>count3) {
            answer = new int[2];
			answer[0] = 1;
			answer[1] = 2;
		}else if(count1==count3 && count3>count2) {
			answer = new int[2];
            answer[0] = 1;
			answer[1] = 3;
		}else if(count2==count3 && count2>count1) {
			answer = new int[2];
            answer[0] = 2;
			answer[1] = 3;
		}else if(count1==count2 && count2==count3) {
			answer = new int[3];
            answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}
		for(int x : answer)
			System.out.println(x);

	}
}
