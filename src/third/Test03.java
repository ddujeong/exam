package third;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum +i;
		}System.out.println(sum);
		scanner.close();
	}

}
