package third;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 1; i <10; i++) {
				System.out.println(a+" * "+ i +" = "+(a*i));
			}
			
		scanner.close();
		
	}

}
