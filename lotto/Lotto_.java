package etc.game.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lotto_ {

	public static void main(String[] args) {

		Integer lottoNum[] = new Integer[7]; // 길이가 7개인 추첨번호를 저장하기 위한 배열선언

		int buy; // 구입 횟수
		System.out.println("***** 로또 자동 추첨 *****");
		System.out.println("몇 번 구입하시겠습니까?");

		Scanner sc = new Scanner(System.in);
		buy = sc.nextInt(); // 구입 횟수 입력받기
		sc.close();

		System.out.println();

		for (int count = 1; count <= buy; count++) {
			System.out.println(count + "차 추첨 : ");

			for (int digitNum = 0; digitNum <= 6; digitNum++) { // 7자리 난수 생성
				lottoNum[digitNum] = (int) (Math.random() * 45) + 1;

				for (int dupNum = 0; dupNum < digitNum; dupNum++) { // 중복수 제거를 위한 for문
					if (lottoNum[digitNum] == lottoNum[dupNum]) { // 중복수가 존재하면 카운트-1
						digitNum--;
					} // 중복수 카운트 END
				} // 중복수 제거 for문 END
			} // 7자리 난수 생성 END

			Arrays.sort(lottoNum); // 내림차순 정렬
			Arrays.sort(lottoNum, (i1, i2) -> i2 - i1); // 오름차차순 정렬

			System.out.println(Arrays.toString(lottoNum));
		} // 구입 횟수 for문 END

	} // main END

} // class END
