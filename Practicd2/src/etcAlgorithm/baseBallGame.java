package etcAlgorithm;

import java.io.*;

class BaseBall {

	private String[] randomNum;
	private int strike;
	private int ball;

	BaseBall() {
		this.strike = 0;
		this.ball = 0;
	}

	public void Random() {
		int hundred = ((int) (Math.random() * 9) + 1);
		int ten = ((int) (Math.random() * 9) + 1);
		int one = ((int) (Math.random() * 9) + 1);
		while(hundred == ten || ten == one || hundred == one) {
			ten = ((int) (Math.random() * 9) + 1);
			one = ((int) (Math.random() * 9) + 1);
		}
		String random = (hundred*100) + (ten*10) + one + "";
		randomNum = random.split("");
		System.out.println(random);
	}

	public void clear() {
		strike = 0;
		ball = 0;
	}

	public boolean compare(String[] answer) {
		for (int i = 0; i < randomNum.length; i++) {
			for (int j = 0; j < randomNum.length; j++) {
				if (answer[i].equals(randomNum[j]) && i == j)
					strike++;
				else if (answer[i].equals(randomNum[j]) && i != j)
					ball++;
			}
		}
		if (strike == 3) {
			return true;
		}
		return false;
	}

	public void hint() {
		if (strike == 0 && ball == 0) {
			System.out.println("낫싱");
		} else if (strike != 0 && ball == 0) {
			System.out.println(strike + " 스트라이크");
		} else if (strike == 0 && ball != 0) {
			System.out.println(ball + " 볼");
		} else {
			System.out.println(strike + " 스트라이크 " + ball + " 볼");
		}
	}

	public void correct() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
		System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.");
	}

}

public class baseBallGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean result = false;
		BaseBall base = new BaseBall();
		int count = 0;
		while (true) {
			if (count == 0) {
				base.Random();
				base.clear();
			}
			System.out.print("숫자를 입력해 주세요: ");
			String[] answer = br.readLine().split("");
			result = base.compare(answer);
			count++;
			if (result) {
				base.correct();
				int chose = Integer.parseInt(br.readLine());
				count = 0;
				if (chose == 1)
					continue;
				else
					break;
			} else {
				base.hint();
			}
			base.clear();
		}

	}
}
