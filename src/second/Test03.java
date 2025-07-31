package second;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
			if (a % 4 == 0) {
				if (a % 100 != 0 || a % 400 == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}scanner.close();
			}else {
				System.out.println("0");
			}scanner.close();
		}
	}


