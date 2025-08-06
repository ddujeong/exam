package second;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int set = scanner.nextInt();
		int sum = m + set;
		
		h = h + sum /60;
		m = sum %60;
		h = h % 24;
		
		System.out.print(h + " " + m);
		scanner.close();
		}

}
