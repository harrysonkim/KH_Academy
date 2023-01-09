package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz {

	public static void main(String[] args) {
		// QUIZ.
		// 2명의 국어, 영어, 수학 점수를 처리하기
		// 학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다

		// ** 2차원배열 이용해보기

		// int[2][3] - 학생들 점수
		// int[2] - 학생들 총점
		// double[2] - 학생들 평균

		// ----- 최종 출력 -----
		// 번호 국어 영어 수학 총점 평균
		// 1번 xxx xxx xxx xxx xxx.xx
		// 2번 xxx xxx xxx xxx xxx.xx

		int[][] score = new int[2][3];
		int[] totalScore = new int[2];
		double[] avgScore = new double[2];

		String[] subject = { "국어", "영어", "수학" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			// ============ 점수 입력 받기 ================
			System.out.println((i + 1) + "번 학생의 점수를 입력 해주세요 \n>>");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(subject[j] + "점수를 입력해주세요 : ");
				score[i][j] = sc.nextInt();
			}
			// ============ 입력된 점수 출력 ================
			System.out.println("+++" + (i + 1) + "번 학생의 과목 점수 " + "+++");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(subject[j] + " : " + score[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
		sc.close();

		// 총점
		for (int i = 0; i < totalScore.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				totalScore[i] += score[i][j];
			}
		}

		// 평균
		for (int i = 0; i < avgScore.length; i++) {
			for (int j = 0; j < score.length; j++) {
				avgScore[i] = totalScore[i] / score[j].length;
			}
		}

		System.out.println("============ 최종출력 ==============");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < score.length; i++) {

			// 번호 출력
			System.out.print((i + 1) + "\t");

			// 국영수
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}

			// 총점
			System.out.print(totalScore[i] + "\t");

			// 평균
			System.out.printf("%.2f", avgScore[i]); // %.2f => 소수점 2자리까지 표시
			System.out.println();
		}
	}
}
