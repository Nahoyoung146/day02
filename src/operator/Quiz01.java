package operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num1 = scan.nextInt();
		String a = (num1 % 2 == 0 && num1 % 3 != 0) ? num1 + " = 짝수\n" + num1 + " = 3의 배수가 아니다."
				: num1 + " = 짝수인데 3의 배수 혹은 홀수인데 3의 배수일수도 있고 아닐수도 있다.";
		System.out.println(a);

		System.out.print("두 수 입력 : ");
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		String b = (num2 > num1) ? "num1 : " + num2 + ", num2 : " + num3 + "\nnum2가 num1보다 크다"
				: "num1 : " + num2 + ", num2 : " + num3 + "\nnum1가 num2보다 크다";
		System.out.println(b);

	}

}