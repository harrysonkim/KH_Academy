package etc.game.rock_paper_scissors;

public class GameResult {

	final private String SCISSORS = "가위";
	final private String ROCK = "바위";
	final private String PAPER = "보";

	public void match(String player, String computer) {

		if (player.equals(SCISSORS) && computer.equals(PAPER)) {
			System.out.println("===== 플레이어가 이겼습니다  =====");
		} else if (player.equals(ROCK) && computer.equals(SCISSORS)) {
			System.out.println("===== 플레이어가 이겼습니다  =====");
		} else if (player.equals(PAPER) && computer.equals(ROCK)) {
			System.out.println("===== 플레이어가 이겼습니다  =====");
		} else if (player.equals(SCISSORS) && computer.equals(SCISSORS)) {
			System.out.println("=====  비겼습니다  =====");
		} else if (player.equals(ROCK) && computer.equals(ROCK)) {
			System.out.println("=====  비겼습니다  =====");
		} else if (player.equals(PAPER) && computer.equals(PAPER)) {
			System.out.println("=====  비겼습니다  =====");
		} else if (player.equals(SCISSORS) && computer.equals(ROCK)) {
			System.out.println("===== 플레이어가 졌습니다  =====");
		} else if (player.equals(ROCK) && computer.equals(PAPER)) {
			System.out.println("===== 플레이어가 졌습니다  =====");
		} else if (player.equals(PAPER) && computer.equals(SCISSORS)) {
			System.out.println("===== 플레이어가 졌습니다  =====");
		} else {
			System.out.println("잘 못 입력하셨습니다.");
			System.out.println("다시 입력 해주세요.");
		}

	}

}
