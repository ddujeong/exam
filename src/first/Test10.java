package first;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		System.out.println(A *(B%10));
		System.out.println(A *((B/10)%10));
		System.out.println(A *(B/100));
		System.out.println(A * B);
		scanner.close();

}
}