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
		
		
		System.out.println(++n1);
		System.out.println(n1++);
	}
}