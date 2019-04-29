import java.io.*;
import java.util.*;

public class Solution10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque deq = new Deque();
		int N = Integer.parseInt(br.readLine());
		String[] input = new String[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = br.readLine();
		}
		for (int k = 0; k < input.length; k++) {
			if (input[k].equals("back"))
				deq.back();
			else if (input[k].equals("front"))
				deq.front();
			else if (input[k].equals("empty"))
				deq.empty();
			else if (input[k].equals("size"))
				deq.size();
			else if (input[k].equals("pop_back"))
				deq.pop_back();
			else if (input[k].equals("pop_front"))
				deq.pop_Front();
			else {
				String[] push = input[k].split(" ");
				if (push[0].equals("push_front"))
					deq.push_Front(Integer.parseInt(push[1]));
				else
					deq.push_Back(Integer.parseInt(push[1]));
			}

		}

	}
}

class Deque {
	ArrayList<Integer> deq = new ArrayList<Integer>();

	void push_Front(int x) {
		deq.add(0, x);
	}

	void push_Back(int x) {
		deq.add(x);
	}

	void pop_Front() {
		if (deq.size() == 0)
			prn(-1);
		else {
			prn(deq.get(0));
			deq.remove(0);
		}
	}

	void pop_back() {
		if (deq.size() == 0)
			prn(-1);
		else {
			prn(deq.get(deq.size() - 1));
			deq.remove(deq.size() - 1);
		}
	}

	void size() {
		prn(deq.size());
	}

	void empty() {
		if (deq.size() == 0)
			prn(1);
		else
			prn(0);
	}

	void front() {
		if (deq.size() == 0)
			prn(-1);
		else
			prn(deq.get(0));
	}

	void back() {
		if (deq.size() == 0)
			prn(-1);
		else
			prn(deq.get(deq.size() - 1));
	}

	void prn(int x) {
		System.out.println(x);
	}

}