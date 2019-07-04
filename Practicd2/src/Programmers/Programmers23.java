package Programmers;

public class Programmers23 {
// level1 : 같은 숫자는 싫어
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = null;
		///////////////////////////////
		int compare = arr[0];
		int count = 1;
		for(int i=1; i < arr.length; i++) {
			if(compare==arr[i]) {
				continue;
			}
			compare = arr[i];
			count++;
		}
		answer = new int[count];
		answer[0] = arr[0];
		int index = 0;
		for(int i=1; i < arr.length; i++) {
			if(answer[index]==arr[i]) {
				continue;
			}
			answer[index+1] = arr[i];
			index++;
		}
		///////////////////////////////
		for(int i=0; i < answer.length; i++)
			System.out.println(answer[i]);
	}
}
