package operator;

import java.util.Scanner;

public class TeammateQuiz {
	public static void main(String[] args) {

//		문제
//		Math.random()을 사용하여 3번 내로 숫자 맞추기 게임 만들기.

		Scanner sc = new Scanner(System.in);
		int right = 0;
		System.out.println("========================");
		System.out.println("1.쉬움	>>>  1~10");
		System.out.println("2.보통	>>>  1~100");
		System.out.println("3.어려움	>>>  1~1000");
		System.out.println("========================");
		System.out.print("난이도 선택 : ");
		int level = sc.nextInt();
		if (level == 1) {
			System.out.println("난이도 : 쉬움");
			right = (int) (Math.random() * 10) + 1;
			System.out.println(right);
		}

		else if (level == 2) {
			System.out.println("난이도 : 보통");
			right = (int) (Math.random() * 100) + 1;
		}

		else {
			System.out.println("난이도 : 어려움");
			right = (int) (Math.random() * 1000) + 1;
		}

		for (int i = 3; i > 0; i--) {
			System.out.println("남은 기회 : " + i);
			System.out.print("정답 입력 : ");
			int num = sc.nextInt();
			if (i == 1) {
				if (num == right)
					System.out.println("정답입니다.");
				else
					System.out.println("제한시간내에 맞추지 못하셨습니다. 정답은 " + right + "입니다.");

			} else {
				if (num == right) {
					System.out.println("정답입니다.");
					break;
				} else {
					if (num > right)
						System.out.println(num + "보다 작습니다.");
					else if (num < right)
						System.out.println(num + "보다 큽니다.");
				}
			}
		}
	}
}