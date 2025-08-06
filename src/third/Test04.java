package third;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			sum += (a * b);
		}if (sum == x) {
				System.out.println("Yes");
		}else {
				System.out.println("No");
			}scanner.close();
		}
	}


