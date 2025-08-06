package second;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int prize = 0;
		int max = 0;
		
		if (a == b && b ==c ) {
			prize = (a*1000) + 10000;
		} else if (a == b || a == c || b == c ) {
			int same;
			if (a == b || a == c) {
				same = a;
			} else {
				same = c;
			} prize = (same*100) + 1000;
		}else {
			 max = Math.max(a, Math.max(b, c));
			 prize = max * 100;
			}
		//System.out.println(a +" " + b + " " + c);
		System.out.println(prize);
		scanner.close();
		}
	
	}


