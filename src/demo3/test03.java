package demo3;

public class test03 {

	public static void main(String[] args) {

		int gewei;// 个位
		int shiwei;// 十位
		int n = 0;

		for (int i = 10; i < 100; i++) {
			gewei = i % 10;
			shiwei = i / 10;
			if (gewei > shiwei) {
				if (n != 0 && n % 10 == 0)
					System.out.println();
				System.out.print(i + " ");
				n++;
			}
		}
		System.out.println();
		System.out.println("n=" + n);
	}

}
