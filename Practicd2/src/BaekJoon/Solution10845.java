package BaekJoon;

import java.io.*;
import java.util.*;

public class Solution10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = new String[N];
		List<Integer> queue = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			input[i] = br.readLine();
		}
		for (int k = 0; k < input.length; k++) {
			String command = input[k];
			if (command.equals("pop")) {
				pop(queue);
			} else if (command.equals("size")) {
				size(queue);
			} else if (command.equals("empty")) {
				empty(queue);
			} else if (command.equals("front")) {
				front(queue);
			} else if (command.equals("back")) {
				back(queue);
			} else {
				String[] push2 = command.split(" ");
				push(queue, Integer.parseInt(push2[1]));
			}
		}
	}

	public static void push(List queue, int X) {
		queue.add(X);
	}

	public static void pop(List queue) {
		if (queue.size() != 0) {
			System.out.println(queue.get(0));
			queue.remove(0);
		} else {
			System.out.println("-1");
		}
	}

	public static void size(List queue) {
		System.out.println(queue.size());
	}

	public static void empty(List queue) {
		if (queue.size() == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public static void front(List queue) {
		if (queue.size() != 0) {
			System.out.println(queue.get(0));
		} else {
			System.out.println("-1");
		}
	}

	public static void back(List queue) {
		if (queue.size() != 0) {
			System.out.println(queue.get(queue.size() - 1));
		} else {
			System.out.println("-1");
		}
	}

}
