package operator;

public class ExClass01 {
	public static void main(String[] args) {
		System.out.println("------산술 연산자------");
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println(n1 / (double) n2);
		System.out.println(n1 % n2);

		System.out.println("------복합대입 연산자------");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1); // 6
		n1 -= 1;
		System.out.println(n1); // 5
		n1 *= n2;
		System.out.println(n1); // 25
		n1 /= n2;
		System.out.println(n1); // 5
		n1 %= n2;
		System.out.println(n1); // 0

		System.out.println("----------관계 연산자----------");
		n1 = 5;
		n2 = 4;
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);

		boolean result = n1 != n2;
		System.out.println("result : " + result);

		System.out.println("--------논리 연산자--------");
		int n3 = 10;
		n1 = 5;
		n2 = 7;
		System.out.println(n1 > n2);
		System.out.println(n1 > n3);
		System.out.println(n1 > n2 && n1 > n3);
		System.out.println(n2 > n1 && n2 > n3);
		System.out.println(n3 > n1 && n3 > n2);

		System.out.println("------or------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("------and------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("------not------");
		System.out.println(!true);
		System.out.println(!(10 > 20));

		System.out.println("---증감 연산자---");
		n1 = 5;
		++n1;
		System.out.println("n1 :" + n1);

		n2 = 5;
		n2++;
		System.out.println("n2 :" + n2);

		System.out.println("-------------");
		n1 = 10;
		n2 = ++n1;
		System.out.println("n1 :" + n1);
		System.out.println("n2 :" + n2);

		System.out.println("-------------");
		n1 = 10;
		n2 = n1++;
		System.out.println("n1 :" + n1);
		System.out.println("n2 :" + n2);

		System.out.println("----조건 연산자----");
		n1 = 30;
		n2 = 20;
		String str1 = (n1 > n2) ? "n1이 n2보다 크다" : "n2가 n1보다 크다";
		System.out.println(str1);
		String str2 = (n1 > n2 && n1 % 2 == 0) ? "n1은 n2보다 큰 짝수" : "n1는 n2보다 작은 홀수";
		System.out.println(str2);

		System.out.println("-----참고-----");
		boolean c;
		int a = 1, b = 2;
		c = (a++ == 1) && (b++ == 2);
		System.out.println("[1]a=" + a + ", b=" + b + ",c=" + c);
		c = (++a == 2) && (++b == 2);
		System.out.println("[2]a=" + a + ", b=" + b + ",c=" + c);
		c = (a++ == 2) || (b++ == 3);
		System.out.println("[3]a=" + a + ", b=" + b + ",c=" + c);
		c = (a++ == 4) || (b++ == 4);
		System.out.println("[4]a=" + a + ", b=" + b + ",c=" + c);
	}
}