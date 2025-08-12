package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Test05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] num = bufferedReader.readLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		
		int[] basket = new int[n];
		
		for (int i = 1; i <= m; i++) {
			String[] input = bufferedReader.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			int ball = Integer.parseInt(input[2]);
			
			for (int j = start - 1; j <= end - 1; j++) {
				basket[j] = ball;
				
				}
			}
		for (int k = 0; k < n; k++) {
			bufferedWriter.write(basket[k] + " ");
		}
		bufferedWriter.flush();
	}

}
