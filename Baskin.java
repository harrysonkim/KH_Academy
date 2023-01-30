package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Baskin {

	public static void main(String[] args) {
//		+ 배스킨라빈스31 게임
//	      - 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
//	      - 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
//	       말할 수 있다
//	      - 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
//	      - 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
//	      - 31을 말하는 사람이 진다
//
//
//	      * 추가 사항
//	         31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
//	        있는 숫자까지만 말한다
//
//	        ex. 사용자가 28까지 말했다면
//	          컴퓨터는 무조건 29, 30까지만 말한다

		int stateNum = 0; // 현재 숫자를 저장하는 변수
		int user; // user가 내는 수를 저장할 변수
		int userLose = 0; // user가 지게 될 카운트 변수
		int com; // com이 내는 수를 저장할 변수
		int comLose = 0; // com이 지게 될 카운트 변수

		Scanner sc = new Scanner(System.in);

		while (stateNum < 31) { // stateNum체크 while문

			// =================== 유저 턴 =================================================
			while (true) { // 입력된 숫자가 1 ~ 3까지의 숫자인지 체크
				System.out.println("몇 개의 숫자를 입력하시겠습니까? (1 ~ 3 입력)");
				user = sc.nextInt();

				if (1 <= user && user <= 3) { // 1 ~ 3까지 숫자가 아니라면 stop
					break;
				} else { // 입력된 값이 1~3이 아니라면 while문 반복
					System.out.println("다시 입력해주세요!! >>");
				}

			} // 입력된 숫자 체크 while문 끝

			for (int i = 0; i < user; i++) { // user턴 반복 for문
				stateNum++; // 현재 숫자 카운트
				userLose = stateNum; // user가 지게 될 카운트 최신화

				System.out.println("user가 입력한 수 : " + stateNum + "(" + userLose + ")");

				if (userLose == 31) { // user가 지는 경우
					System.out.println("user가 졌습니다");
					break;
				}

			} // user턴 반복 for문 끝

			// =================== 컴퓨터 턴 =================================================
			if (stateNum < 31) {
				Random rd = new Random();
				com = rd.nextInt(3) + 1; // com의 1,2,3 난수 생성
				System.out.println("com이 낸수 : " + com);
				for (int i = 0; i < com; i++) { // com턴 반복 for문
//			      * 추가 사항
//		         31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
//		        있는 숫자까지만 말한다
//		        ex. 사용자가 28까지 말했다면
//		          컴퓨터는 무조건 29, 30까지만 말한다
					if (stateNum == 28) { // 마지막 세자리수 남겨뒀을때
						// 3개만
						com = 3; // com이 이기기 위한 입력 수 상수화
						stateNum++; // 현재 숫자 카운트
						comLose = stateNum;
						System.out.println("com이 입력한 수 : " + stateNum + "(" + comLose + ")");

					} else if (stateNum == 29) { // 마지막 두자리수 남겨뒀을때
						// 2개만
						com = 2; // com이 이기기 위한 입력 수 상수화
						stateNum++; // 현재 숫자 카운트
						comLose = stateNum; // com이 지게 될 카운트 최신화
						System.out.println("com이 입력한 수 : " + stateNum + "(" + comLose + ")");

					} else if (stateNum == 30) { // 마지막 한자리수 남겨뒀을때
						// 1개만
						com = 1; // com이 이기기 위한 입력 수 상수화
						stateNum++; // 현재 숫자 카운트
						comLose = stateNum; // com이 지게 될 카운트 최신화
						System.out.println("com이 입력한 수 : " + stateNum + "(" + comLose + ")");

					} else { // 일반적인 상황에서 반복문
						stateNum++; // 현재 숫자 카운트
						comLose = stateNum; // com이 지게 될 카운트 최신화
						System.out.println("com이 입력한 수 : " + stateNum + "(" + comLose + ")");
					}

					if (comLose == 31) { // com이 지는 경우
						System.out.println("com이 졌습니다");
						break;
					}
				} // com턴 반복 for문 끝
			}
		} // stateNum체크 while문 끝
		sc.close(); // 스캐너 close
	} // main 끝
}// class 끝
