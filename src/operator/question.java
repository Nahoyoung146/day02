package operator;

import java.util.Scanner;

public class question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================================");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("===============================================");
		System.out.print("메뉴 선택 : ");
		int num1 = sc.nextInt();
		System.out.println("===============================================");
		System.out.println("1. ICE");
		System.out.println("2. HOT");
		System.out.println("===============================================");
		System.out.print("온도 선택 : ");
		int num2 = sc.nextInt();
		System.out.print("추가 사항 입력 >> 샷추가, 시럽추가, 얼음제거, 얼음추가/ 샷이랑 시럽의 경우 횟수도 입력 : ");
		String option = sc.next();
		int num3 = sc.nextInt();

		if (num1 == 1) {
			if (num2 == 1)
				System.out.println("선택하신 메뉴는 아이스 아메리카노입니다.");

			else
				System.out.println("선택하신 메뉴는 핫 아메리카노입니다.");
		}

		else {
			if (num2 == 1)
				System.out.println("선택하신 메뉴는 아이스 카페라떼입니다.");

			else
				System.out.println("선택하신 메뉴는 핫 카페라떼입니다.");
		}

		if (option.equals("샷추가") || option.equals("시럽추가")) {
			if (num3 >= 10)
				System.out.println("몸에 않 좋습니다. 적당히 넣으세요");

			else
				System.out.println("음료나왔습니다.\n맛있게 드세요.");
		}

		else {
			System.out.println("음료나왔습니다.\n맛있게 드세요.");
		}
	}
}