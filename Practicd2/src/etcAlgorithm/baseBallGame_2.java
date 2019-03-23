package etcAlgorithm;
import java.io.*;

class BaseBallGame2 {

	private String[] randomNum;
	private String[] answer;
	private BufferedReader input;
	private int strike;
	private int ball;
	private boolean result;
	private int index;

	BaseBallGame2() {
		this.input = new BufferedReader(new InputStreamReader(System.in));
		this.strike = 0;
		this.ball = 0;
		this.result = false;
		this.index = 0;
	}

	public void Game() throws IOException {
		inPut();
		result = marKing();
		if (result) {
			clear();
			correct();
		} else {
			hint();
			clear();
			Game();
		}
	}

	public void generateRandomNum() throws IOException {
		int hundred, ten, one;
		while (true) {
			ten = ((int) (Math.random() * 9) + 1);
			one = ((int) (Math.random() * 9) + 1);
			hundred = ((int) (Math.random() * 9) + 1);
			if(hundred != ten || ten != one || hundred != one)
				break;
		}
		randomNum = ((hundred * 100) + (ten * 10) + one + "").split("");
		System.out.println(randomNum[0]+randomNum[1]+randomNum[2]);
		Game();
	}

	public void inPut() throws IOException {
		System.out.print("숫자를 입력해 주세요: ");
		answer = input.readLine().split("");
	}

	public boolean marKing() {
		for (int i = 0; i < randomNum.length; i++) {
			if(answer[i].equals(randomNum[index]) && i == index)
				strike++;
			else if(answer[i].equals(randomNum[index]) && i != index)
				ball++;
		}
		index++;
		if(index<3)
			marKing();
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

	public void correct() throws NumberFormatException, IOException {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
		System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.");
		int correct = Integer.parseInt(input.readLine());
		if (correct == 1)
			generateRandomNum();
		else
			System.exit(0);
	}

	public void clear() {
		strike = 0;
		ball = 0;
		index = 0;
	}
}

public class baseBallGame_2 {
	public static void main(String[] args) throws IOException {
		BaseBallGame2 game = new BaseBallGame2();
		game.generateRandomNum();
	}

}
