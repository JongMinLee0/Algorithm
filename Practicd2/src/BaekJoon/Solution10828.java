package BaekJoon;

import java.util.*;
import java.io.*;

public class Solution10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> stack = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		String[] command = new String[N];
		for (int i = 0; i < N; i++) {
			command[i] = br.readLine();
		}
		for (int k = 0; k < command.length; k++) {
			String comm = command[k];
			if (comm.equals("size"))
				size(stack);
			else if (comm.equals("empty"))
				empty(stack);
			else if (comm.equals("top"))
				top(stack);
			else if (comm.equals("pop"))
				pop(stack);
			else {
				String[] pushs = comm.split(" ");
				int num = Integer.parseInt(pushs[1]);
				push(stack, num);
			}

		}

	}

	public static void push(List stack, int num) {
		stack.add(num);
	}

	public static void size(List stack) {
		System.out.println(stack.size());
	}

	public static void empty(List stack) {
		int length = stack.size();
		if (length == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}

	public static void top(List stack) {
		if (stack.size() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack.get(stack.size() - 1));
		}
	}

	public static void pop(List stack) {
		if (stack.size() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);
		}
	}
}
