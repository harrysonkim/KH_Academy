package etc.game.rock_paper_scissors;

public class Main {

	public static void main(String[] args) {

		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("+++++ 가위 바위 보 Game +++++");
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("::::: 가위 / 바위 / 보 中 입력하세요 :::::");
		System.out.println("\t>>");

		Trump trump = new Trump();
		trump.start();

	}
}
