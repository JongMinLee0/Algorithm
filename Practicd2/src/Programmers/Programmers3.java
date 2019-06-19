package programmers;

import java.util.Arrays;

// level1: K번째 수

public class Programmers3 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = {};
		answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0]-1;
			int end = commands[i][1]-1;

			int[] tempArray = new int[end - start + 1];
			int index = 0;
			for (int w = start; w <= end; w++) {
				tempArray[index++] = array[w];
			}
			Arrays.sort(tempArray);
			answer[i] = tempArray[commands[i][2]-1];
			System.out.println(answer[i]);
		}

	}
}
