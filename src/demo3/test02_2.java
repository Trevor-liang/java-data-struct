package demo3;

public class test02_2 {
	public static void main(String[] args) {
		
		int n, num, num1;
		System.out.println("在1~100可被3与7整除的为");
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
