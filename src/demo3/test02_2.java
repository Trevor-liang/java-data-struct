package demo3;

public class test02_2 {
	public static void main(String[] args) {
		
		int n, num, num1;
		System.out.println("��1~100�ɱ�3��7������Ϊ");
		n = 1;
		while (n <= 100) {
			num = n % 3;
			num1 = n % 7;
			if (num == 0 && num1 == 0)
				System.out.print(n + " ");
			n++;
		}

		System.out.println(" ");

	}
}
