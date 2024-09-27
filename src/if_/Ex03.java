package if_;

public class Ex03 {
	public static void main(String[] args) {
		int num = 9;
		if (num > 10) {
			System.out.println("if 실행");
		} else {
			System.out.println("else 실행");
		}
		System.out.println("다음 문장들 실행!!!");

		int n1, ret;
		int n2 = 10;
//		System.out.println(n1);
//		ret = n1 + n2

//		if (n2 >= 10)
//			n1 = 100;
//		if (n2 < 10)
//			n1 = 10;
//		System.out.println(n1);
//		if문 둘 다 실행이 안될 수 있어서 문제 발생

		if (n2 >= 10)
			n1 = 100;
		else
			n1 = 10;
		System.out.println(n1);
//	이러면 if문이나 else문 둘 중에 하나는 무조건 실행되므로 문제 해결 		

//		초기화
		int i = 0;
		double d = 0;
		char c = 0;
		boolean a = false;
		String str = "null";

//		int k,m,e;
		int k = 0, m = 0, e = 0; // 다시 초기화
		int sum = k + m + e; // 위에서 초기화 안되서 에러뜸
		System.out.println(sum);

	}
}