package etc.game.rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public class Trump {

	public void start() {

//======================= 플레이어 수 =======================================
		// 플레이어의 입력
		Scanner sc = new Scanner(System.in);
		String player = sc.nextLine();
		sc.close();

		// 입력받은 값을 저장하기 위한 data 공간 생성
		Data data = new Data();

		// 플레이어의값을 저장
		data.setPlayer(player);
		System.out.println("플레이어가 낸 수 : " + data.getPlayer());

//======================== 컴퓨터 수 ======================================
		// 랜덤수를 받을 공간 생성
		Random rd = new Random();
		// 0,1,2 3가지의 난수에 +1을 하여 수를 직관적으로 표현
		int computer = rd.nextInt(3) + 1;

		final String SCISSORS = "가위";
		final String ROCK = "바위";
		final String PAPER = "보";

		if (computer == 1) {
			String computerStr = Integer.toString(computer);
			computerStr = SCISSORS;
			data.setComputer(computerStr);
			System.out.println("컴퓨터가 낸 수 : " + data.getComputer());

		} else if (computer == 2) {
			String computerStr = Integer.toString(computer);
			computerStr = ROCK;
			data.setComputer(computerStr);
			System.out.println("컴퓨터가 낸 수 : " + data.getComputer());

		} else if (computer == 3) {
			String computerStr = Integer.toString(computer);
			computerStr = PAPER;
			data.setComputer(computerStr);
			System.out.println("컴퓨터가 낸 수 : " + data.getComputer());

		}

		GameResult gameResult = new GameResult();
		gameResult.match(data.getPlayer(), data.getComputer());
	}
}
