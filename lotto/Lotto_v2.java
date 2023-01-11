package etc.game.lotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto_v2 {

	public static void main(String[] args) {

		// ==================구입 횟수 입력 받기 =====================
		System.out.println("몇 회 구입하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();

		List<Integer> lottoArray = new ArrayList<Integer>();

		Random rd = new Random();
		// currentTimeMillis() : 현재 시간을 반환하는 식
		rd.setSeed(System.currentTimeMillis() * 1000);

		System.out.println("--------------------------------");

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 6; j++) {
				int lottoNum = rd.nextInt(44) + 1;
				if (lottoArray.contains(lottoNum))
					j--;
				else
					lottoArray.add(lottoNum);
			}
			lottoArray.sort(Comparator.naturalOrder());

			String result = String.format("%d 번째 추출번호 : %s", i + 1, lottoArray);
			System.out.println(result);
			lottoArray.clear();
		}
		System.out.println("---------------------------");
	} // main END

} // class END
